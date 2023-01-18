package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ZoomService implements CourseService{

//    @Autowired//field injection, Constructor injection, setter injection
//    @Qualifier("CloudRepository")
//    private Repository repository;
// eğer tek contructor varsa autowired opinaldır tek te kullanmya gerek yok
private Repository repository;

    @Autowired
    public void setRepository(@Qualifier("cloudRepository") Repository repository){
        this.repository= repository;
    }


    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getGetname() + " dersi ile zoom anlatıyor");
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
