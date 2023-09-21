package com.example.demo.Repository.Admintation.UserDetailsRepository;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Models.Admintation.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
