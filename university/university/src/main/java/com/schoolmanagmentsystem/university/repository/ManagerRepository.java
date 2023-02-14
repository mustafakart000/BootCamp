package com.schoolmanagmentsystem.university.repository;


import com.schoolmanagmentsystem.university.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Long> {
    boolean existsByEmailManager(String emailManager);
}
