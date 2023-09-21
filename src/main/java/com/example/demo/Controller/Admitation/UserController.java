package com.example.demo.Controller.Admitation;

import com.example.demo.Models.Admintation.UserRole;
import com.example.demo.Service.Admintation.UserDetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDetailsService userDetailsService ;
    // insert user role details
    @PostMapping("/insertRole")
    public ResponseEntity<String> InsertRole(@RequestBody UserRole userRole){
        userDetailsService.InsertRole(userRole);
//        System.out.println(userRole.getRoleCode());
        String message = "successfully insert user Role";
        return ResponseEntity.ok(message);
//        return ResponseEntity.status(HttpStatus.OK).body(responseData);
    }

}
