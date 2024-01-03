package com.example.capstoneproject.repository;

import com.example.capstoneproject.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findById(Integer adminId);
}
