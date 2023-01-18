package com.tpe2.app;

import com.tpe2.AppConfiguration;
import com.tpe2.domain.Course;
import com.tpe2.service.ConnectService;
import com.tpe2.service.FaceTime;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class myApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);

        Course crs= context.getBean("course", Course.class);
        crs.setId(2);
        crs.setName("Lesson");

        ConnectService ctx= context.getBean("faceTime", FaceTime.class);

        ctx.callVideo(crs);


    }
}
