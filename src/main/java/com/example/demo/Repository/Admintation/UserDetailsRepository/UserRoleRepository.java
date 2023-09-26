package com.example.demo.Repository.Admintation.UserDetailsRepository;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Models.Admintation.Users;
import com.example.demo.Models.ForestLetter.LetterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    @Query(value = "SELECT * FROM `letter_document` WHERE `sys_no` = ?1",nativeQuery = true)
    LetterDetails findLetter(String SystemNo);}
