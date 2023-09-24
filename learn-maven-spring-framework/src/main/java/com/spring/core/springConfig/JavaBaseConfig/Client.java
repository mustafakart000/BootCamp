package com.spring.core.springConfig.JavaBaseConfig;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication

public class Client {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        Bike bike = applicationContext.getBean(Bike.class);
        Traveller traveller = applicationContext.getBean(Traveller.class);

        traveller.startJourney();



    }
}
