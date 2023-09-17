package com.example.demo.Models.Factories;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;
    private String regionCode ;
    private String regionName ;

}
