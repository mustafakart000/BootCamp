package com.moc.service;

import com.moc.domain.Course;
import com.moc.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MeetService implements TeacherCourse {


//    @Autowired
//    @Qualifier("cloudRepository")
//    private Repository repository;

//    @Autowired
//    @Qualifier("cloudRepository")
//    private Repository repository;
//    public void setRepository(Repository repository) {
//        this.repository= repository;
//    }




    private Repository repository;
    @Autowired


    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+" dersi meet service ile anlatılıyor...");
    }


    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
