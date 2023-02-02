package com.schoolmanagmentsystem.university.controller;


import com.schoolmanagmentsystem.university.domain.Manager;
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
public class StudentController extends  ManagerController {


    @Autowired
    ManagerController managerController;

    @GetMapping
    public ResponseEntity<List<Manager>> getStudentId(@RequestParam("id") Long id) {
      return managerController.getAllStudent();
    }

    @GetMapping("/getallstudent")
    public ResponseEntity<List<Manager>> getAllStudents() {
        return managerController.getAllStudent();
    }

//    @PostMapping //ogrencilerin ogrenci profil oluşturma yetkisi yoktur bu yüzden eklendi ancak okumaya alındı.
//    public ResponseEntity<Map<String,String>> createStudent(@RequestBody Manager manager){
//         studentService.createStudent(manager);
//         Map<String,String> map = new HashMap<String,String>();
//         map.put("message", "Student created successfully");
//         map.put("status", "true");
//         return new ResponseEntity<>(map, HttpStatus.CREATED);
//    }




}
