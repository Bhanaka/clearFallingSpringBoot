package com.example.demo.Repository.Admintation;

import com.example.demo.Models.Admintation.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
