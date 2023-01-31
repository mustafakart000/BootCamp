package com.schoolmanagmentsystem.university.controller;


import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping
    public ResponseEntity<List<Student>> getStudentId() {
      List<Student> student1 =  studentService.getAllStudents();
        return ResponseEntity.ok(student1);
    }

    @PostMapping
    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Student student){
         studentService.createStudent(student);
         Map<String,String> map = new HashMap<String,String>();
         map.put("message", "Student created successfully");
         map.put("status", "true");
         return new ResponseEntity<>(map, HttpStatus.CREATED);
    }


}
