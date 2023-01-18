package com.poc.repo;

import com.poc.domain.Course;

public class LocalRepo implements Repo {

    @Override
    public void save(Course course) {
        System.out.println(course.getName()+" ders local'e kaydediliyor...");
        System.out.println(course.getC());
    }
}
