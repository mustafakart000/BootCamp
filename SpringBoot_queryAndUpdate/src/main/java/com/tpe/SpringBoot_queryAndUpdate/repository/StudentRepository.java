package com.tpe.SpringBoot_queryAndUpdate.repository;

import com.tpe.SpringBoot_queryAndUpdate.DTO.StudentDTO;
import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    boolean existsByEmail(String email);

    Page<Student> findAllWithPage(Pageable pageable);//SQL


    List<Student> findByLastName(String lastName);

//    @Query("SELECT s from Student s WHERE s.grade=:pGrade")    // Student --> s
//    List<Student> findAllEqualsGrade(Integer grade);
//    @Query("SELECT new com.tpe.SpringBoot_queryAndUpdate.DTO.StudentDTO(s) FROM Student s WHERE s.id=:id ")
//    Optional<StudentDTO> findByStudentDTOById(@Param("id") Long id);
}
