package com.example.retrywithspringboot.service;


import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryService {


    @Retryable(value = ArithmeticException.class, maxAttempts = 5, backoff = @Backoff(value = 5000))
    public String performRetryOperation() {
        System.out.println("retry method started");
        int i = 0;
        int n = 5 / i; //arithmetic exception

        return "SUCCESS";
    }

    @Recover
    public String getRecoveryAfterRetry() {

        return "3rd party api is not responding";
    }
}
