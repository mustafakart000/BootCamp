package com.tpe.SpringBoot_queryAndUpdate.repository;

import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    boolean existsByEmail(String email);

    Page<Student> findAllWithPage(Pageable pageable);//SQL


    List<Student> findByLastName(String lastName);

    List<Student> findAllEqualsGrade(Integer grade);
}
