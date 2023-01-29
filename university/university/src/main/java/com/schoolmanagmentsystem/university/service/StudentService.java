package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.DTO.StudentDTO;
import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
@Autowired
private StudentRepository repository;
    @Autowired
    private StudentRepository studentRepository;

    public void createStudent(Student student) {
        if (repository.existsByEmailStudent(student.getEmailStudent()))
            {
                throw new ConflictException("Email student already exists");
            }
        repository.save(student);
    }


    public List<Student> getStudent() {
        return repository.findAll();
    }

    public List<Student> getStudentDTO() {


        return repository.findAll();

    }
}

