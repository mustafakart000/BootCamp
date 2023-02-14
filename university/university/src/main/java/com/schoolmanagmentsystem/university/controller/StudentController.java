package com.schoolmanagmentsystem.university.controller;


import com.schoolmanagmentsystem.university.domain.Manager;
import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import com.schoolmanagmentsystem.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<Student> getStudentId(@RequestParam("id") Long id) {
        Student students = studentService.getStudent(id);
        return ResponseEntity.ok(students);
    }



    @GetMapping("/getallstudent")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students= studentService.getAllStudent();
         return ResponseEntity.ok(students);
    }
//    @RequestMapping(method = RequestMethod.POST,path=("/manager/post"))
    @PostMapping //ogrencilerin ogrenci profil oluşturma yetkisi yoktur bu yüzden eklendi ancak okumaya alındı.
    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Student student){
         studentService.createStudent(student);
         Map<String,String> map = new HashMap<String,String>();
         map.put("message", "Student created successfully");
         map.put("status", "true");
         return new ResponseEntity<>(map, HttpStatus.CREATED);
    }




}
