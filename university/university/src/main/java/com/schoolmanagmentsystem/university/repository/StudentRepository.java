package com.schoolmanagmentsystem.university.repository;


import com.schoolmanagmentsystem.university.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    boolean existsByEmailStudent(String emailStudent);
}
