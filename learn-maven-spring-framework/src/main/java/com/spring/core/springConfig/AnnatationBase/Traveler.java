

package com.spring.core.springConfig.AnnatationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {

    private final Vehicle vehicle;



    @Autowired
    public Traveler(@Qualifier("cycle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }



    public void startJourney() {
        vehicle.move();
    }
}