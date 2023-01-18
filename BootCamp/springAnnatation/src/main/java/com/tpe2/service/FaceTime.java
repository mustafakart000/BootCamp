package com.tpe2.service;

import com.tpe2.domain.Course;
import org.springframework.stereotype.Component;

@Component
public class FaceTime implements ConnectService {


    public void callVideo(Course course){
        System.out.println("ders facetime ile canlı olarak kaydediliyor..."+ course.getName()+" : " + course.getId());
    }

}
