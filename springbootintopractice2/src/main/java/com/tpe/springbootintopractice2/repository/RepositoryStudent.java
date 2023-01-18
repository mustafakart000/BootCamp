package com.tpe.springbootintopractice2.repository;

import com.tpe.springbootintopractice2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryStudent extends JpaRepository<Student,Long> {
}
