package com.example.demo.Controller.Admitation;

import com.example.demo.Models.Admintation.UserRole;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // insert user role details
    @PostMapping("/insertRole")
    public void InsertRole(){
        System.out.println("jfgjnjgskl");
//        return userRole ;
    }

}
