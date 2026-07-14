package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    @Test
    void getGreetingReturnsExpectedString() {
        GreetingService svc = new GreetingService();
        String expected = "Hello from GreetingService";
        assertEquals(expected, svc.getGreeting());
    }
}
