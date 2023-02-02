package com.schoolmanagmentsystem.university.controller;


import com.schoolmanagmentsystem.university.domain.Manager;
import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.domain.Teacher;
import com.schoolmanagmentsystem.university.service.ManagerService;
import com.schoolmanagmentsystem.university.service.StudentService;
import com.schoolmanagmentsystem.university.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;
    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @RequestMapping(method = RequestMethod.POST)

    @GetMapping("/getallstudents")
    public ResponseEntity<List<Manager>> getAllStudent(){
       List<Manager> manager= managerService.getAllStudent();
        return ResponseEntity.ok(manager);
   }
    @PostMapping        //Manager Create
    public ResponseEntity<Map<String,String>> createManager(@RequestBody Manager manager){

        managerService.createManager(manager);
        Map map= new HashMap<String,String>();
        map.put("message", "Manager is created successfully");
        map.put("Status", "TRUE");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

   @PostMapping         //Student Create
    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Manager manager){
        Student student= new Student(manager);
        studentService.createStudent(student);
        Map map= new HashMap<String,String>();
        map.put("message", "Student is created successfully");
        map.put("Status", "TRUE");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @PostMapping        //Teacher Create
    public ResponseEntity<Map<String,String>> createTeacher(@RequestBody Manager manager){
        Teacher teacher= new Teacher(manager);
        teacherService.createTeacher(teacher);
        Map map= new HashMap<String,String>();
        map.put("message", "Teacher is created successfully");
        map.put("Status", "TRUE");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }




   }







