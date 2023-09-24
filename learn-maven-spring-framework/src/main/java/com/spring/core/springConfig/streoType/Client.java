package com.spring.core.springConfig.streoType;

import com.spring.core.springConfig.streoType.controller.DemoController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoController demoController=context.getBean(DemoController.class);
        demoController.demoController();
    }
}
