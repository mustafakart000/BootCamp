package com.tpe.controller;

import com.tpe.domain.Student;
import com.tpe.repository.StudentRepository;
import com.tpe.service.StudentService;
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

@RestController
@RequestMapping("/students")//http://localhost:8080/students (class seviye annotations)
//despatcher yukardaki students class ile ilgili bir request alıyorsa bu datayı bu class'a gönderiyor.
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;


    //!!!get All Students (tüm öğrenciler gelsin)

    @GetMapping //http://localhost:8080/students + GET
    public ResponseEntity <List<Student>> getAll(){
       List<Student> students= studentService.getAll();

       return ResponseEntity.ok(students);//200 kodu HTTP status kodu olarak gönderir.


    }


    //Student objesi oluşturalım

    @PostMapping //http://localhost:8080/students + POST + JSON
    //postmapping create etmek için
    public  ResponseEntity<Map<String, String>> createStudent(@RequestBody Student student){

        studentService.createStudent(student);

        Map<String,String> map = new HashMap<>();

        map.put("message", "Student is created successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
    //Id ile ogrenci getirelim
    @GetMapping("/query") //http://localhost:8080/students/query?id=1 birden fazla data istiyorsak
    public ResponseEntity<Student> getStudent(@RequestParam("id") Long id){
       Student student= studentService.findStudent(id);
        return ResponseEntity.ok(student);
        //Hata almak için veya hatasız olduğunu bildirmek için ResponseEntity kullanıyoruz

    }


    @GetMapping("{id}") //http://localhost:8080/students/1 +GET   bir data için
    public ResponseEntity<Student> getStudentWithPath(@PathVariable("id") Long id){

        Student student= studentService.findStudent(id);
        return ResponseEntity.ok(student);

    }
    //!!! delete

    @DeleteMapping("/{id}") //http://localhost:8080/students/1 + DELETE
    public ResponseEntity<Map<String,String>> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        Map<String,String> map = new HashMap<>();

        map.put("message", "Student is deleted successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }



    //Update

    @PutMapping("{id}") //http://localhost:8080/students/1 + PUT

    public ResponseEntity<Map<String,String>> updateStudent(@PathVariable("id") Long id,@Valid @RequestBody Student student){

        Map<String,String> map = new HashMap<>();
        map.put("message", "Student is deleted successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.OK);

    }


    //PageAble
    @GetMapping("/page")
    public ResponseEntity<Page<Student>> getAllWithPage(
            @RequestParam("page") int page,//Hangi page gonderilecek 0 dan başlar
            @RequestParam("size") int size,//page başı kaç student olacak
            @RequestParam("sort") String prop,//sortlama hangi field'a göre olacak
            @RequestParam("direction")  Sort.Direction direction)//Doğal sıralımı olsun.
    { //pageable calss turunde bır obje uret ve obje ile gel bana der spring
        Pageable pageable = PageRequest.of(page,size,Sort.by(direction,prop)); //Ontarafa Pageable ile gonderiyoruz
        Page<Student> studentPage =  studentService.getAllWithPage(pageable);
        return ResponseEntity.ok(studentPage);
    }








}
