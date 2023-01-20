package com.tpe.springbootintopractice2.service;

import com.tpe.springbootintopractice2.domain.Student;
import com.tpe.springbootintopractice2.exception.ConflictException;
import com.tpe.springbootintopractice2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();

    }

    public void createStudent(Student student) {
        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new ConflictException("Email is already exist");

        }
        studentRepository.save(student);
    }
}
