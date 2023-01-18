package com.tpe.service;

import com.tpe.domain.Course;

public class MeetService implements CourseService {

    public void teacherCourse(Course course) {
        System.out.println(course.getName() + "dersi Meet ile anlatılıyor.");

    }

    @Override
    public void saveCourse(Course course) {

    }

}
