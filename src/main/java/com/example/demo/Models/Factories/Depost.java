package com.example.demo.Models.Factories;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "depost")
public class Depost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depostId;
    private String depostCode ;
    private String depostName ;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regionCode ;
}
