package com.poc.service;

import com.poc.domain.Course;

public class MeetService implements CourseService {
    @Override
    public void teachCourse(Course course) {

        System.out.println(course.getC()+" c=a+b MeetService");

    }

    @Override
    public void saveCourse(Course course) {

    }
}
