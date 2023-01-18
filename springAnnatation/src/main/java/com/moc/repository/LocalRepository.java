package com.moc.repository;

import com.moc.domain.Course;
import org.springframework.stereotype.Component;

@Component
public class LocalRepository implements Repository{


    @Override
    public void save(Course course) {
        System.out.println(course.getName()+ ": " + "LocalRepository buluta kaydediliyor...");
    }
}
