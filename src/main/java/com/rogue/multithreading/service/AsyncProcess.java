package com.rogue.multithreading.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AsyncProcess implements Runnable {
    private int id;

    public AsyncProcess(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        log.info("id: {}", id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
