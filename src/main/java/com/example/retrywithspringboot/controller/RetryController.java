package com.example.retrywithspringboot.controller;

import com.example.retrywithspringboot.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {

@Autowired
    RetryService retryService;

    @GetMapping("/demo/retry")
    public String getRetryDemo() {

        return retryService.performRetryOperation();
    }

}
