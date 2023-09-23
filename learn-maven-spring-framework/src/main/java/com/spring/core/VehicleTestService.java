package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    @Autowired
    @Qualifier("bikeVehicle")
    Vehicle vehicle;

    public void testVehicle(){
        vehicle.move();
    }

}
