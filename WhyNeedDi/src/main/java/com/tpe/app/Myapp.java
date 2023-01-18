package com.tpe.app;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.Repo;
import com.tpe.service.CourseService;
import com.tpe.service.MeetService;
import com.tpe.service.ZoomService;

public class Myapp {
    public static void main(String[] args) {


        Course course = new Course();
        course.setName("advanced Java");

        //course'umuzun zoom ile anlatılmasını istiyoruz

//        ZoomService zoomService = new ZoomService();
//        zoomService.teacherCourse(course);


        //Dersin meet ile yapılmasını istiyoruz.

        MeetService meetService = new MeetService();
        meetService.teacherCourse(course);
    }

    //daha kolay bakım  ve geliştirme için: interface.

//    CourseService service = new ZoomService();

    //
    Repo repo = new CloudRepo();
    CourseService service2= new ZoomService(repo);

    service2.teacherCourse(course);
    service2.saveCourse(course);


}
