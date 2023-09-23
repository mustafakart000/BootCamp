package com.spring.core;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        Traveler traveler = new Traveler(vehicle);
        traveler.startJourney();

    }
}
