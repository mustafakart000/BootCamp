package com.tpe.springbootintopractice2.controller;


import com.tpe.springbootintopractice2.domain.Student;
import com.tpe.springbootintopractice2.repository.StudentRepository;
import com.tpe.springbootintopractice2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/controllerstudent")
public class ControllerStudent {

    @Autowired
    StudentService studentService;


    //getALl
    @GetMapping //http://localhost:8080/controllerstudent +GET
    public ResponseEntity<List<Student>> getAll()
        {
            List<Student> students = studentService.getAll();

            return ResponseEntity.ok(students); //200 kodu HTTP status kodu olarak gönderir.
        }


    //Create

    @PostMapping //http://localhost:8080/controllerstudent POST + JSON

    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        Map<String,String> map = new HashMap<>();
        map.put("message","Student is created successfully");
        map.put("status","true");
        return  new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/query") //http://localhost:8080/students/query?id=1 birden fazla data istiyorsak

    public ResponseEntity<Student> getStudent(@RequestParam Long id){
        Student student = studentService.getAll(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }






}
