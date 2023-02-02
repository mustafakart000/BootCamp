package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.domain.Manager;
import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.domain.Teacher;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.ManagerRepository;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import com.schoolmanagmentsystem.university.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;



    public List<Manager> getAllStudent() {

        return managerRepository.findAll();
    }

    public void createManager(Manager manager) {
        if (managerRepository.existsByEmail(manager.getEmailManager())){
            throw new ConflictException("Manager mail already exists");
        }
        managerRepository.save(manager);
    }





}

