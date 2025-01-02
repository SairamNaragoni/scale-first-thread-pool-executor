package com.rogue.multithreading.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@Configuration
@Slf4j
public class CustomThreadPoolExecutorConfig {
    @Bean("customScaleFirstThreadPoolExecutor")
    public ScaleFirstThreadPoolExecutor customScaleFirstThreadPoolExecutor(final ScaleFirstExecutionProperties properties){
        log.info("Creating a bean '{}'","customScaleFirstThreadPoolExecutor");
        TaskExecutionProperties.Pool pool = properties.getPool();
        return new ScaleFirstThreadPoolExecutor(pool.getCoreSize(), pool.getMaxSize(), pool.getKeepAlive().getSeconds(),
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(pool.getQueueCapacity()));
    }
}
