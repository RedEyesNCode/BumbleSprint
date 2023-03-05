package com.redeyesncode.bumblejwtboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redeyesncode.bumblejwtboot.models.ERole;
import com.redeyesncode.bumblejwtboot.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
