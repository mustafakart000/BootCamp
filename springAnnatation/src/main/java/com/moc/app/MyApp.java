package com.moc.app;

import com.moc.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);


}
