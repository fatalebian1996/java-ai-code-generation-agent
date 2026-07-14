package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    /**
     * Return the greeting message used by the controller.
     */
    public String getGreeting() {
        return "Hello from GreetingService";
    }
}
