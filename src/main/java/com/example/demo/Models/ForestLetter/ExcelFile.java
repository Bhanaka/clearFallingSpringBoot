package com.example.demo.Models.ForestLetter;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "excelFile")
public class ExcelFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long letterFileId;
    private String fileName ;
}
