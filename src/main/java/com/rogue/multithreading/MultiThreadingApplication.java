package com.rogue.multithreading;

import com.rogue.multithreading.service.Invoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreadingApplication implements CommandLineRunner {

	@Autowired
	Invoker invoker;

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		invoker.invoke(1000);
	}
}
