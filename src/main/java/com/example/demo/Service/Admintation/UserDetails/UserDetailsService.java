package com.example.demo.Service.Admintation.UserDetails;

import com.example.demo.DTO.Admintation.RoleStatusDTO;
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
    public void updateRoleStatus(RoleStatusDTO roleStatusDTO) {
        System.out.println("test :"+roleStatusDTO.getStatus());
        if ("true".equals(roleStatusDTO.getStatus())){
//            System.out.println("now status value is true");
            userRoleRepository.DeActivateUserRole("false" , roleStatusDTO.getId());
        }else if("false".equals(roleStatusDTO.getStatus())){
//            System.out.println("now status value is false");
            userRoleRepository.DeActivateUserRole("true" , roleStatusDTO.getId());
        }
    }
}
