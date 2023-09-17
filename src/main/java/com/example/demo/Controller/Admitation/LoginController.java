package com.example.demo.Controller.Admitation;

import com.example.demo.DTO.Admintation.UserLoginRequest;
import com.example.demo.Models.Admintation.Users;
import com.example.demo.Repository.Admintation.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admintation")
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> Login(@RequestBody UserLoginRequest userLoginRequest){
        Users users = userRepository.findByUsername(userLoginRequest.getUsername());
        if (users == null || !users.getPassword().equals(userLoginRequest.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
        return ResponseEntity.ok("Login successful");

    }
}
