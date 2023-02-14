package com.schoolmanagmentsystem.university.service;

import com.schoolmanagmentsystem.university.domain.Manager;
import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.domain.Teacher;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;



    public List<Manager> getallManager() {

        return managerRepository.findAll();
    }

    public void createManager(Manager manager) {
        if (managerRepository.existsByEmailManager(manager.getEmailManager())){
            throw new ConflictException("Manager mail already exists");
        }
        managerRepository.save(manager);
    }





}

