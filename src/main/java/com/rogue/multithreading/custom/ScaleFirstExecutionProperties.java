package com.rogue.multithreading.custom;


import lombok.Data;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("scale-first.execution")
public class ScaleFirstExecutionProperties {
    @NestedConfigurationProperty
    private final TaskExecutionProperties.Pool pool = new TaskExecutionProperties.Pool();
}
