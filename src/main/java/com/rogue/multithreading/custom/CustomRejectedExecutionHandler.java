package com.rogue.multithreading.custom;

public interface CustomRejectedExecutionHandler {
    void rejectedExecution(Runnable r, ScaleFirstThreadPoolExecutor executor);
}
