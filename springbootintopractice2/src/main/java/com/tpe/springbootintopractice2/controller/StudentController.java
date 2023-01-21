package com.tpe.springbootintopractice2.controller;


import com.tpe.springbootintopractice2.domain.Student;

import com.tpe.springbootintopractice2.repository.StudentRepository;
import com.tpe.springbootintopractice2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/studentcontoller")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;


    //getALl
    @GetMapping //http://localhost:8080/studentcontoller +GET
    public ResponseEntity<List<Student>> getAll()
        {
            List<Student> students = studentService.getAll();

            return ResponseEntity.ok(students); //200 kodu HTTP status kodu olarak gönderir.
        }


    //Create

    @PostMapping //http://localhost:8080/studentcontoller POST + JSON

    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        Map<String,String> map = new HashMap<>();
        map.put("message","Student is created successfully");
        map.put("status","true");
        return  new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/query") //http://localhost:8080/studentcontoller/query?id=1 birden fazla data istiyorsak

    public ResponseEntity<Student> getStudent(@RequestParam("id") Long id){

     Student student= studentService.findStudent(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    //delete

    @DeleteMapping("/{id}") //http://localhost:8080/studentcontoller/1

    public ResponseEntity<Map<String,String>> deleteStudent(@PathVariable("id") Long id){

        studentService.deleteStudent(id);
        Map<String,String> map = new HashMap<String,String>();

        map.put("id", "Student is deleted successfully");
        map.put("status", "true");

        return new ResponseEntity<>(map,HttpStatus.OK);

    }

    @PutMapping("{id}") //http://localhost:8080/students/
    public ResponseEntity<Map<String,String>> updateStudent(    @PathVariable("id") Long id,
                                                                @Valid @RequestBody Student student ){

        /* @Valid : parametreler valid mi kontrol eder, bu örenekte Student
        objesi oluşturmak için  gönderilen fieldlar yani
        name gibi özellikler düzgün set edilmiş mi ona bakar.
         @RequestBody = gelen parametreyi, requestin bodysindeki bilgilerin,
        Student objesine map edilmesini sağlıyor.*/

        studentService.createStudent(student);
        Map<String, String> map = new HashMap<>();
        map.put("message", "Student is updated successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

















}
