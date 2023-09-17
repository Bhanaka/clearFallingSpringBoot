package com.example.demo.Repository.ForestLetter;

import com.example.demo.Models.ForestLetter.ExcelFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterExcelFileRepository extends JpaRepository<ExcelFile, Long> {
}
