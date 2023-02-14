package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.domain.Teacher;

import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.exception.NotFoundException;

//import com.schoolmanagmentsystem.university.repository.TeacherRepository;
import com.schoolmanagmentsystem.university.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TeacherService {

@Autowired
TeacherRepository teacherRepository;

    public void createTeacher(Teacher teacher) {
        if (teacherRepository.existsByEmailTeacher(teacher.getEmailTeacher())) {
           throw new ConflictException("Before That  is created a user by this email ");
        }
        teacherRepository.save(teacher);
    }

    public Teacher getTeacher(Long id) {
       return teacherRepository.findById(id).orElseThrow(()->new NotFoundException("there is no such identity" +id));

    }

    public List<Teacher> getAllTeachers() {
       return teacherRepository.findAll();
    }
}
