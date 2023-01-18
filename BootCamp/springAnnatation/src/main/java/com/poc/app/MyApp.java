package com.poc.app;

import com.poc.domain.Course;
import com.poc.repo.CloudRepo;
import com.poc.repo.Repo;
import com.poc.service.CourseService;
import com.poc.service.MeetService;
import com.poc.service.ZoomService;

public class MyApp {
    public static void main(String[] args) {
        Course course   = new Course();

        course.setName("Java");
        course.setC(4,5);


//        CourseService service = new ZoomService();
//        CourseService service1= new MeetService();//MeetService
//
//
//        service.teachCourse(course);
//        service1.teachCourse(course);
//        service.saveCourse(course);
        Repo repo = new CloudRepo();
        CourseService  service2= new ZoomService(repo);
        service2.teachCourse(course);
        service2.saveCourse(course);
    }
}
