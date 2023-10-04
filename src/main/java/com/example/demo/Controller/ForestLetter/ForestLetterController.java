package com.example.demo.Controller.ForestLetter;

import com.example.demo.DTO.ForestLetter.LetterDTO;
import com.example.demo.Models.ForestLetter.LetterDetails;
import com.example.demo.Repository.ForestLetter.LetterDetailsRepository;
import com.example.demo.Repository.ForestLetter.LetterFileRepository;
import com.example.demo.Service.ForestLetter.ForestLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/forestLetter")
@CrossOrigin(origins= "http://192.168.1.35:8080")

public class ForestLetterController {
    @Autowired
    private ForestLetterService forestLetterService ;

    @Autowired
    private LetterDetailsRepository letterDetailsRepository ;
    @Autowired
    private LetterFileRepository letterFileRepository;

    @PostMapping("/insertLetter")
    public ResponseEntity<String> DocumentDetail(
            @RequestParam("file") MultipartFile file,
            @ModelAttribute LetterDTO letterDTO){
        forestLetterService.processFileAndKey(file ,letterDTO );
        String responseData = "Successfully insert letter details and file" ;
        return ResponseEntity.status(HttpStatus.OK).body(responseData);
    }
    @GetMapping("/LettersDetails")
    public List <LetterDetails> GetAllLetters(){
        List <LetterDetails> AllLetterList =letterDetailsRepository.findAll();
//        System.out.println(AllLetterList);
        return AllLetterList ;
    }
    @GetMapping("/eachLetter/{SystemNo}")
    public LetterDetails GetEachLetter(@PathVariable String SystemNo){
        return letterDetailsRepository.findLetter(SystemNo);

    }
    @GetMapping("/LastId")
    public Long getLastId(){
        return forestLetterService.getLastId()  ;
    }
}
