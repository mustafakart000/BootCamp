package com.tpe.SpringBoot_queryAndUpdate.controller;

import com.tpe.SpringBoot_queryAndUpdate.DTO.StudentDTO;
import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
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

import javax.servlet.http.HttpServletRequest;
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



    //Bütün ogrenciler gelsin
    @GetMapping //http://localhost:8080/students + GET
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentService.getAll();
        return ResponseEntity.ok(students);//200 kodunu HTTP status kodu olarak gönderir
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
        return ResponseEntity.ok(student);
    }

    //!!! id ile ogrenci getirelim @PathVariable ile
    @GetMapping("{id}") //http://localhost:8080/student/1 +GET
    public ResponseEntity<Student> getStudentwithPath(@PathVariable("id") Long id){
        Student student = studentService.findStudent(id);
        return ResponseEntity.ok(student); //student +200 kod
    }

    //!!! delete
    @DeleteMapping("/{id}") //http://localhost:8080/students/1 +delete
    public ResponseEntity<Map<String,String>> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        Map<String,String> map = new HashMap<>();
        map.put("message","Student is deleted successfully");
        map.put("status","true");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

    //!!! Pageable
    @GetMapping("/page")
    public ResponseEntity<Page<Student>> getAllStudents(
            @RequestParam("page") int page, // hangi page gönderilecek .. 0 dan başlıyor
            @RequestParam("size") int size, // page başı kaç student olacak
            @RequestParam("sort") String prop, // sıralama hangi fielda göre yapılacak
            @RequestParam("direction") Sort.Direction direction) { // doğal sıralı mı olsun ?
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,prop));
        Page<Student> studentPage = studentService.getAllWithPage(pageable);
        return ResponseEntity.ok(studentPage);
    }

    //Get by LasName
    @GetMapping("/querylastname") //http://localhost:8080/students/querylastname
    public ResponseEntity<List<Student>> getByLastName(@RequestParam("lastName") String lastName) {
        List<Student> listLastName= studentService.findByLastName(lastName);
        return ResponseEntity.ok(listLastName);
    }

    //Get by Name


    //Get By grade

//    @GetMapping("/grade/{grade}") //http://localhost:8080/students/querylastname
//    public ResponseEntity<List<Student>> getStudentsEqualsGrade(@PathVariable("grade") Integer grade) {
//        List<Student> list = studentService.findAllEqualsGrade(grade);
//        return ResponseEntity.ok(list);
//    }

//    @GetMapping("/query/dto") //http://localhost:8080/students/query/dto?id=1
//    public ResponseEntity<StudentDTO> getStudentDTO(@RequestParam("id") Long id) {
//        StudentDTO studentDTO = studentService.findStudentDTOById(id);
//        return ResponseEntity.ok(studentDTO);
//    }

    // !!! DB den direk DTO olarak data alabilir miyim ?
//    @GetMapping("/query/dto")   //  http://localhost:8080/students/query/dto?id=1
//    public ResponseEntity<StudentDTO> getStudentDTO(@RequestParam("id") Long id) {
//        StudentDTO studentDTO = studentService.findStudentDTOById(id);
//        return ResponseEntity.ok(studentDTO);
//    }
//    @GetMapping("/welcome") //http://localhost:8080/welcome +GET
//    public String welcome(HttpServletRequest request) { //HttpServletRequest ilerequest'e hosgeldiniz
//        logger.warn("--------------------------------Welcome {}", request.getServletPath());
//        return "Student Controller'a hosgeldiniz.";
//    }
}
