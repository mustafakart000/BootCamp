package com.tpe.springbootintopractice.repository;

import com.tpe.springbootintopractice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// Spring data Jpa
//Trick bilgi Repository annotation koymasak da JpaRepository extends ettiğimiz componnerScan bu intarface'in
// child'larından obje üretilmek için veya enject için hafızaya alır
public interface StudentRepository extends JpaRepository<Student, Long> {


    boolean existsByEmail(String email);
}
