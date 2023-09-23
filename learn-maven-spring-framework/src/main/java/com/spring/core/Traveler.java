package com.spring.core;

public class Traveler {
    private final Vehicle vehicle;
    public Traveler(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }

}
