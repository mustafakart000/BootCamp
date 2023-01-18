package com.poc.repo;

import com.poc.domain.Course;

public class CloudRepo implements Repo {

    @Override
    public void save(Course course) {
        System.out.println("Dersi CloudRepo class'a kaydediliyor");
        System.out.println(course.getC());
    }
}
