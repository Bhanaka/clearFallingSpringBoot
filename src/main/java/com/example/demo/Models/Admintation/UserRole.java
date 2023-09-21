package com.example.demo.Models.Admintation;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "userRole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName ;
    private String roleCode ;
    private String active ;
}
