package com.tpe.springbootintopractice2.repository;

import com.tpe.springbootintopractice2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    boolean existsByEmail(String email);
}
