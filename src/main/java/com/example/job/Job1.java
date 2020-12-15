package com.example.job;

import com.example.service.Service1;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job1 {

    @Autowired
    private Service1 service1;

    @Scheduled(cron = "${job.cron}")
    // name 唯一性
    // lockAtMostFor 该属性指定在执行节点死亡的情况下应将锁保留多长时间。此值应大于任务的时长，任务花费的时长不应该大于此值
    // lockAtLeastFor 该属性指定应保留锁定的最短时间。
    // 如果不指定 lockAtMostFor 在 @SchedulerLock 将使用 @EnableSchedulerLock 中设置的值.
    @SchedulerLock(name = "com.example.job.run", lockAtMostFor = "30s", lockAtLeastFor = "30s")
    public void run() {
        service1.run();
    }
}
