package com.example.demo.Models.Factories;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long region_id;
    private String region_txt ;
    private String region_code ;
    private int region_status ;

}
