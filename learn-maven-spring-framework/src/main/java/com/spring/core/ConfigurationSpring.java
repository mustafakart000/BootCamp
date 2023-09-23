package com.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class ConfigurationSpring {

    @Bean
    public  Vehicle carVehicleServive() {
        return new Car();
    }

    @Bean
    @Qualifier("bikeVehicle")
    public  Vehicle bikeVehicleServive() {
        return new Bike();
    }

    @Bean
    public  Vehicle cycleVehicleServive() {
        return new Cycle();
    }


}
