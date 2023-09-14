package com.saferent.repository;

import com.saferent.domain.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByType(RoleType type);
}
