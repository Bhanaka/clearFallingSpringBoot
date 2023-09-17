package com.example.demo.Controller.ForestLetter;

import com.example.demo.Service.ForestLetter.ClearFallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/clearFalling")
public class ClearFallingController {
    @Autowired
    public ClearFallingService clearFallingService ;
    @PostMapping("/insertClearFalling")
    public void InsertClearFalling(
            @RequestParam("file") MultipartFile file,
            @RequestParam String SystemNo){
        clearFallingService.ClearFallingXlFile(file ,SystemNo) ;
    }
}
