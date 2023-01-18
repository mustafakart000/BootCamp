package com.tpe.controller;

import com.tpe.domain.Student;
import com.tpe.repository.StudentRepository;
import com.tpe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //http://127.0.0.1:8080/students //bu endpointdir

@RequestMapping ("/students") // bura daki annotation students ile gelen tüm requestleri bu class'ımla methodlar ile
                                // map'le demek oluyor
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hi") //students/hi

    public ModelAndView sayHi(){
        ModelAndView mav  = new ModelAndView();
        mav.addObject("message", "Merhaba");
        mav.addObject("messagebody", "ben bir ogrenci yonetim sistemiyim.");
        mav.setViewName("hi");//hi.jsp
        return mav;
    }
    //post'u kaydetmek için put'u da update
    @GetMapping("/new")

    public String sendStudentForm(@ModelAttribute("student") Student student){

        return "studentForm";//@ModelAttribute("student") model e student isminde bir attibute ekledık

    }

    @PostMapping
    public String createStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/student";
    }

    @GetMapping
    public ModelAndView getStudent(@ModelAttribute Student student) {
        List<Student> list = studentService.getAllStudent();
        ModelAndView mav = new ModelAndView();
        mav.addObject("students", list);
        mav.setViewName("students");
        return mav;

    }

    //update

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("id") Long id, Model model) {

        Student student = studentService.findStudentById(id);
        return "studentForm";
    }
//@RequestParam'ı birden fazla paremetrelerde @PathVariable'de tek paremetreler de detaylı bilgi spring Boot da
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentService.deleteStudent(id);

        return "redirect:/students";
    }





}
