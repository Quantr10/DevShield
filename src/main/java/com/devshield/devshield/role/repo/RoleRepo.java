package com.devshield.devshield.role.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devshield.devshield.role.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
