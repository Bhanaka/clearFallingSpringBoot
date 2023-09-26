package com.example.demo.Controller.Admitation;

import com.example.demo.DTO.Admintation.RoleStatusDTO;
import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Repository.Admintation.UserDetailsRepository.UserRoleRepository;
import com.example.demo.Service.Admintation.UserDetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDetailsService userDetailsService ;
    @Autowired
    private UserRoleRepository userRoleRepository ;
    // insert user role details
    @PostMapping("/insertRole")
    public ResponseEntity<String> InsertRole(@RequestBody UserRole userRole){
        userDetailsService.InsertRole(userRole);
        String message = "successfully insert user Role";

        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    // Retrieve the all user roles
    @GetMapping("/getAllUserRoles")
    public List <UserRole> AllUserRoles (){
        return userRoleRepository.findAll() ;
    }
     // maintain the status of user role (active or deactivate)
    @PutMapping("/changeRoleStatus")
    public void changeRoleStatus(@RequestBody RoleStatusDTO roleStatusDTO){
//        System.out.println("id : "+ roleStatusDTO.getId());
//        System.out.println("status :" +Status);
        userDetailsService.updateRoleStatus() ;
    }
}
