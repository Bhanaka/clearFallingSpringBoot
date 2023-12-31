package com.example.demo.Repository.Admintation.UserDetailsRepository;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Models.Admintation.Users;
import com.example.demo.Models.ForestLetter.LetterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    @Modifying
    @Query(value = " UPDATE `user_role` " +
            "SET `active` = ?1 " +
            "WHERE `id` = ?2 ", nativeQuery = true)
    void DeActivateUserRole(String state , String id) ;
    }