package com.example.demo.Service.Admintation.UserDetails;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Repository.Admintation.UserDetailsRepository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    @Autowired
    private UserRoleRepository userRoleRepository ;
    public void InsertRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
}
