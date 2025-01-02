package com.rogue.multithreading.service;

import com.rogue.multithreading.custom.ScaleFirstThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class Invoker {

    @Autowired
    private ScaleFirstThreadPoolExecutor executor;

    public void invoke(int n){
        List<AsyncProcess> asyncProcesses = new ArrayList<>();
        IntStream.range(0,n).forEach( value -> executor.submit(new AsyncProcess(value)));
    }
}
