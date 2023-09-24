package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    StudentRepo studentRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudent() {
        return List.of(new Student(1L, "mehmet",
                "mehmet@gmail.com",
                LocalDate.of(2000, Month.APRIL,3), 23));
    }

    public List<Student> getStudentRepo() {
        return studentRepo.findAll();
    }
}
