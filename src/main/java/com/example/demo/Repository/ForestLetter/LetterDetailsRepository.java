package com.example.demo.Repository.ForestLetter;

import com.example.demo.Models.ForestLetter.LetterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LetterDetailsRepository extends JpaRepository<LetterDetails, Long> {
    @Query(value = "SELECT * FROM `letter_document` WHERE `sys_no` = ?1",nativeQuery = true)
    LetterDetails findLetter(String SystemNo);
}
