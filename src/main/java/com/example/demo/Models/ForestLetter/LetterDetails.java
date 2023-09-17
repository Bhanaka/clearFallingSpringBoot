package com.example.demo.Models.ForestLetter;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "letterDocument")
public class LetterDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long letterId;
    private String myRef ;
    private String SysNo ;
    private String Date ;
    @OneToOne
    @JoinColumn(name = "file_id")
    private LetterFile letterFile ;
    @OneToOne
    @JoinColumn(name="excel_id")
    private ExcelFile excelFile ;

}
