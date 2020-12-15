package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduleConfig /*implements SchedulingConfigurer*/ {

//    /**
//     * 多线程执行定时任务
//     *
//     * 所有的定时任务都放在一个线程池中，定时任务启动时使用不同线程。
//     *
//     * @param taskRegistrar
//     */
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()));
//    }
}
