package com.schoolmanagmentsystem.university.controller;




import com.schoolmanagmentsystem.university.domain.Teacher;
import com.schoolmanagmentsystem.university.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/teacher")

public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/getallteacher")
    public ResponseEntity<List<Teacher>> getAllTeachers()  {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return ResponseEntity.ok(teachers);
    }

    @GetMapping("/query")
    public ResponseEntity<Teacher> getStudentId(@RequestParam("id") Long id){
        Teacher teacherId= teacherService.getTeacher(id);
        return ResponseEntity.ok(teacherId);
    }

//  Ogretmenler kendi profillerini oluşturamazlar bu yetki manager'a aittir farkındalık için yazılmıştır
    @PostMapping
    public ResponseEntity<Map<String,String>> postTeacher(@RequestBody Teacher teacher){
        Map map = new HashMap<String,String>();
       teacherService.createTeacher(teacher);

        map.put("message", "Teacher is created successfully");
        map.put("status", "True");

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }




}

