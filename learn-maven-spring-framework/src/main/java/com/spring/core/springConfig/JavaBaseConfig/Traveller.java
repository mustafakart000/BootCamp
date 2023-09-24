

package com.spring.core.springConfig.JavaBaseConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Traveller {

    private final Vehicle vehicle;




    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



    public void startJourney() {
        vehicle.move();
    }
}