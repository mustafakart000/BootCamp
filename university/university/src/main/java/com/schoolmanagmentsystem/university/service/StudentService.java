package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.exception.NotFoundException;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudent() {
       return studentRepository.findAll();
    }



    public void createStudent(Student student) {

        if (studentRepository.existsByEmailStudent(student.getEmailStudent())){
            throw new ConflictException("Student already exists");
        }
        studentRepository.save(student);
    }


    public Student getStudent(Long id) {

        return  studentRepository.findById(id).orElseThrow(()-> new NotFoundException("Student not found"));
        }


}

