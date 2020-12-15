package com.example.config;

import net.javacrumbs.shedlock.provider.elasticsearch.ElasticsearchLockProvider;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

//@Configuration
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "1H")   // 将此值设置为远高于正常任务持续时间的某个值。可以在每个ScheduledLock注释中覆盖。
public class ShedLockConfig {

    @Bean
    public ElasticsearchLockProvider lockProvider(RestHighLevelClient highLevelClient) {
        return new ElasticsearchLockProvider(highLevelClient);
    }
}
