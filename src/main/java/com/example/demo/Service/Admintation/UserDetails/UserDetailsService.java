package com.example.demo.Service.Admintation.UserDetails;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Repository.Admintation.UserDetailsRepository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class UserDetailsService {
    @Autowired
    private UserRoleRepository userRoleRepository ;
    public void InsertRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
    @Transactional
    public void updateRoleStatus() {
        String RoleStatus = "true" ;
        if (RoleStatus == "true"){
//            System.out.println("now status value is true");
            userRoleRepository.DeActivateUserRole("true" , "1");
        }
    }
}
