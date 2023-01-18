package com.tpe.springbootintopractice.service;

import com.tpe.springbootintopractice.domain.Student;
import com.tpe.springbootintopractice.exception.ConflictException;
import com.tpe.springbootintopractice.exception.ResourceNotFoundException;
import com.tpe.springbootintopractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll(){

        return studentRepository.findAll(); //SELECT * FROM Student
    }
    public void createStudent(Student student) {
        if (studentRepository.existsByEmail((student.getEmail()))) {
            throw new ConflictException("Email already exists");
        }
        studentRepository.save(student);
    }
    public Student findStudent(Long id) {
     return studentRepository.findById(id).
             orElseThrow(()-> new ResourceNotFoundException("Student not found with id " + id));
    }
}
