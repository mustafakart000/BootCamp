package com.tpe;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//
@ComponentScan("com.tpe")
public class AppConfiguration {



@Bean
    public String appName(String appName){
    System.out.println("Mustafa kart"+ appName);
    return appName;
}



}
