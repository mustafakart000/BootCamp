package com.spring.core.springConfig.AnnatationBase;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication

public class Client {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        Bike bike = applicationContext.getBean(Bike.class);
        System.out.println("==============bike==============");
        bike.move();
        System.out.println("==============car===============");
        car.move();
        System.out.println("==========================");
        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();




    }
}
