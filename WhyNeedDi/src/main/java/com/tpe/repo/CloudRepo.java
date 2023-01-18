package com.tpe.repo;

import com.tpe.domain.Course;
import org.w3c.dom.ls.LSOutput;

public class CloudRepo implements Repo {

    @Override
    public void save(Course course) {
        System.out.println("Bulut'a kaydediliyor"+ course.getName());
    }
}
