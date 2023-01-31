package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.domain.Teacher;

import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
