package com.tpe.repository;

import com.tpe.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Spring data Jpa
//Trick bilgi Repository annotation koymasak da JpaRepository'i extend ettiğimiz için ComponnerScan bunu hemen anlar
//Spring boot ile Çalışıyorsak interface olması gerekir

public interface StudentRepository extends JpaRepository<Student, Long> {


    boolean existsByEmail(String email);
}
