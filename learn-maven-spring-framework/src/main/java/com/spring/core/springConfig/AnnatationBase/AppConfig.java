package com.spring.core.springConfig.AnnatationBase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.springConfig.AnnatationBase")

public class AppConfig {

//    @Bean
//    public Vehicle car(){
//        return  new Car();
//    }
//
// So similarly you can configure the spring bean name for other classes as well.
//    @Bean
//    public Vehicle bike(){
//        return  new Bike();
//    }
//
//
//    @Bean
//    public Vehicle cycle(){
//        return  new Cycle();
//    }
//
//    @Bean
//    public Traveler traveller(){
//        return  new Traveler( car()); //Dependency injection (DI)
//    }
}
