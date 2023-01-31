package com.schoolmanagmentsystem.university.controller;




import com.schoolmanagmentsystem.university.domain.Teacher;
import com.schoolmanagmentsystem.university.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/teacher")

public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping
    public ResponseEntity<Map<String,String>> postTeacher(@RequestBody Teacher teacher){
        Map map = new HashMap<String,String>();
       teacherService.createTeacher(teacher);

        map.put("message", "Teacher is created successfully");
        map.put("status", "True");

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }


}

