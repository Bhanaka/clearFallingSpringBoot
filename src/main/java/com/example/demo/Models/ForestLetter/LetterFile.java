package com.example.demo.Models.ForestLetter;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "letterFile")
public class LetterFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long letterFileId;
    private String fileName ;
}
