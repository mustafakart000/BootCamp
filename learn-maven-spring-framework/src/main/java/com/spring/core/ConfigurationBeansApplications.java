package com.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigurationBeansApplications {
    public static void main(String[] args) {
       ConfigurableApplicationContext context =  SpringApplication.run(ConfigurationBeansApplications.class, args);
//       Vehicle vehicle = context.getBean(Vehicle.class);
//       vehicle.move();
        VehicleTestService vehicleTestService = context.getBean(VehicleTestService.class);
        vehicleTestService.testVehicle();

    }

}
