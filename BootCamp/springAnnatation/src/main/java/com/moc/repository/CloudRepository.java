package com.moc.repository;

import com.moc.domain.Course;
import org.springframework.stereotype.Component;

@Component
public class CloudRepository {
    public void save(Course course){
        System.out.println(course.getName() + ": " + "CloudRepository dersi buluta kaydediliyor...");
    }
}
