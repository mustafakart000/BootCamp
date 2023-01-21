package com.tpe.springbootintopractice2.service;

import com.tpe.springbootintopractice2.domain.Student;
import com.tpe.springbootintopractice2.exception.ConflictException;
import com.tpe.springbootintopractice2.exception.ResourceNotFoundException;
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

    //Create a new Student data
    // we can use this method for Create and update however we can not use update structure on this method for DTO
    public void createStudent(Student student) {
        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new ConflictException("Email is already exist");

        }
        studentRepository.save(student);
    }

    public Student findStudent(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }


    public void deleteStudent(Long id) {
        Student student = findStudent(id);
        studentRepository.delete(student);
    }


}
