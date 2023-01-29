package com.schoolmanagmentsystem.university.repository;

import com.schoolmanagmentsystem.university.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    boolean existsByEmailTeacher(String emailTeacher);
}
