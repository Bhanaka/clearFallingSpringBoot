package com.example.demo.Models.Admintation;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "forest_user")
public class ForestUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forest_user_id;
    private boolean accountStatus ;
    private String contactNo ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id" ,referencedColumnName = "levelId")
    private UserRole userRole ;

}
