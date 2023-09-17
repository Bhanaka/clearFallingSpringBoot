package com.example.demo.Models.Admintation;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

}
