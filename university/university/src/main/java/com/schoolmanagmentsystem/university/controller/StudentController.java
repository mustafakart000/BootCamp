package com.schoolmanagmentsystem.university.controller;

import com.schoolmanagmentsystem.university.DTO.StudentDTO;
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

    @PostMapping
    public ResponseEntity<Map<String,String>> createStudent(@Valid  @RequestBody Student student){
        studentService.createStudent(student);
        Map<String,String> map = new HashMap<String,String>();
        map.put("message","Student is created successfully in database ");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/student/getalldto")
    public ResponseEntity <List<StudentDTO>> getAllStudents(@Valid @RequestBody StudentDTO studentDTO){
      List<Student> student = studentService.getStudentDTO();
        studentDTO = new StudentDTO(student);
        return ;
    }

    @GetMapping("/query")
    public ResponseEntity<Student> getStudent(@RequestBody Student student){

        return null;
    }


}
