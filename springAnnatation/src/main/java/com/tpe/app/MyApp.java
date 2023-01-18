package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);


        Course course = context.getBean("course",Course.class);
        course.setGetname("SQL");


        CourseService service= context.getBean("zoomService",CourseService.class);
        service.teachCourse(course);
        service.saveCourse(course);

        String name = context.getBean("string",String.class);

        System.out.println(name.length());


    }





}
