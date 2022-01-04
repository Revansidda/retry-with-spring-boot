package com.example.retrywithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RetryWithSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetryWithSpringBootApplication.class, args);
    }

}
