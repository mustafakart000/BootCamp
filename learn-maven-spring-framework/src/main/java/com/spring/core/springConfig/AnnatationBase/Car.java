package com.spring.core.springConfig.AnnatationBase;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("car is moving...");
    }
}
