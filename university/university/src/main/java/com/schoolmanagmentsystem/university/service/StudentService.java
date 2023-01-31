package com.schoolmanagmentsystem.university.service;



import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ConfigurationException;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }


    public void createStudent(Student student) {

        if (studentRepository.existsByEmailStudent(student.getEmailStudent())){
            throw new ConflictException("Student already exists");
        }
        studentRepository.save(student);
    }
}

