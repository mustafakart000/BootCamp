package com.spring.core.springConfig.JavaBaseConfig;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("car is moving...");
    }
}
