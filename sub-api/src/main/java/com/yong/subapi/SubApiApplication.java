package com.yong.subapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.yong")
public class SubApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubApiApplication.class, args);
    }

}
