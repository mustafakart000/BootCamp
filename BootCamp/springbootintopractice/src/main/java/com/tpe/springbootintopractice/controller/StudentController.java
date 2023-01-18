package com.tpe.springbootintopractice.controller;


import com.tpe.springbootintopractice.domain.Student;
import com.tpe.springbootintopractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {
    public static void main(String[] args) {


    }

    @Autowired
    private StudentService studentService;




    //!!! get All students (tüm öğrenciler gelsin)
    @PostMapping
    public ResponseEntity<Map<String, String>> createStudent(@RequestBody Student student){

        studentService.createStudent(student);
        Map<String, String> map = new HashMap<>();
        map.put("message", "Student is created successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    //Id ile ogrenci getirelim

    @GetMapping("/query")
    public ResponseEntity<Student> getStudent(@RequestParam("id") Long id){
        Student student = studentService.findStudent(id);
        return ResponseEntity.ok(student);
    }



}
