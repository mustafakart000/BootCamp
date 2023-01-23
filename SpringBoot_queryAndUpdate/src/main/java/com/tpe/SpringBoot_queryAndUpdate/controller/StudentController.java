package com.tpe.SpringBoot_queryAndUpdate.controller;

import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
import com.tpe.SpringBoot_queryAndUpdate.repository.StudentRepository;
import com.tpe.SpringBoot_queryAndUpdate.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;


@RestController
@RequestMapping("/students")//http://localhost:8080/students
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentRepository studentRepository;


    //Bütün ogrenciler gelsin
    @GetMapping //http://localhost:8080/students + GET
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentService.getAll();
        return ok(students);//200 kodunu HTTP status kodu olarak gönderir
    }

    //!!! Student objesi oluşturalım
    @PostMapping //http://localhost:8080/students + POST +JSON
    public ResponseEntity<Map<String, String>> createStudent(@Valid @RequestBody Student student){
        studentService.createStudent(student);
        Map<String, String> map = new HashMap<String, String>();
        map.put("message", "Student is created successfully");
        map.put("status", "true");

        return new ResponseEntity<>(map, HttpStatus.CREATED);//201

    }
    // Id ile ogrenci getirelim
    @GetMapping("/query") //http://localhost:8080/students/query?id=1
    public ResponseEntity<Student> getStudentRequest(@RequestParam("id") Long id){
        Student student =studentService.findStudent(id);
        return ok(student);
    }

    //!!! id ile ogrenci getirelim @PathVariable ile
    @GetMapping("/query") //http://localhost:8080/student/1 +GET
    public ResponseEntity<Student> getStudentwithPath(@PathVariable("id") Long id){
        Student student = studentService.findStudent(id);
        return ok(student); //student +200 kod
    }

    //!!! delete
    @DeleteMapping("/{id}") //http://localhost:8080/students/1 +delete
    public ResponseEntity<Map<String,String>> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        Map<String,String> map = new HashMap<String,String>();
        map.put("message","Student is deleted successfully");
        map.put("status","true");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

    //!!! Pageable
    @GetMapping("/page")
    public ResponseEntity<Page<Student>> getAllStudents(@RequestParam(value = "page",
                                                                defaultValue = "0") int page,
                                                        @RequestParam(value = "size",
                                                                defaultValue = "10") Integer size,
                                                        @RequestParam("sort" ) String prop,
                                                        @RequestParam("sort" )Sort.Direction direction){
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,prop));
        Page<Student> studentPage = studentService.getAllWithPage(pageable);
        return ok(studentPage);
    }

    //Get by LasName
    @GetMapping("/querylastname") //http://localhost:8080/students/querylastname
    public ResponseEntity<List<Student>> getByLastName(@RequestParam("lastName") String lastName) {
        List<Student> listLastName= studentService.findByLastName(lastName);
        return ok(listLastName);
    }

    //Get by Name


    //Get By grade

    @GetMapping("/grade/{grade}") //http://localhost:8080/students/querylastname
    public ResponseEntity<List<Student>> getStudentsEqualsGrade(@PathVariable("grade") Integer grade) {
        List<Student> list = studentService.findAllEqualsGrade(grade);

        return ResponseEntity.ok(list);
    }

}
