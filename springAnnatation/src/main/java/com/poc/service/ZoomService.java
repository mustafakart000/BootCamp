package com.poc.service;

import com.poc.domain.Course;
import com.poc.repo.Repo;


public class ZoomService implements CourseService{

    private Repo repo;
    public ZoomService(Repo repo){
        this.repo = repo;
    }
    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+" :: zoom ile canlı ders");
    }

    @Override
    public void saveCourse(Course course) {
//        Repo repo = new CloudRepo(); bu yontem aslında sıkı bağlama yöntemidir
        repo.save(course);
    }


}
