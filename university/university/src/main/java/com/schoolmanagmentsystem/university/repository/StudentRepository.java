package com.schoolmanagmentsystem.university.repository;


import com.schoolmanagmentsystem.university.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    boolean existsByEmailStudent(String emailStudent);

}
