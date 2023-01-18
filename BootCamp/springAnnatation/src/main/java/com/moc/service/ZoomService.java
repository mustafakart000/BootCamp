package com.moc.service;

import com.moc.domain.Course;
import org.springframework.stereotype.Component;

@Component
public class ZoomService implements TeacherCourse {

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+ " zoom dersi ile anlatıyor...");
    }
    @Override
    public void saveCourse(Course course){

    }
}
