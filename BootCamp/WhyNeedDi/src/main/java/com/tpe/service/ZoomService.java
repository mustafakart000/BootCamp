package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.Repo;

public class ZoomService implements CourseService{

    private Repo repo;

    public ZoomService(Repo repo) {
        this.repo = repo;
    }

    public void teacherCourse(Course course){
        System.out.println(course.getName()+ "dersi Zoom ile anlatılıyor.");

    }

    @Override
    public void saveCourse(Course course) {

//        Repo repo = new CloudRepo();
        repo.save(course);

    }
}
