package com.example.demo.Service.ForestLetter;

import com.example.demo.DTO.ForestLetter.LetterDTO;
import com.example.demo.Models.ForestLetter.LetterDetails;
import com.example.demo.Models.ForestLetter.LetterFile;
import com.example.demo.Repository.ForestLetter.LetterDetailsRepository;
import com.example.demo.Repository.ForestLetter.LetterFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class ForestLetterService {
    private final String letterFile = "fileUpload";
    private String filePath ;
    @Autowired
    LetterDetailsRepository letterDetailsRepository ;
    @Autowired
    LetterFileRepository letterFileRepository ;
    public void processFileAndKey(MultipartFile file , LetterDTO letterDTO){
        LetterDetails letterDetails = new LetterDetails() ;
        letterDetails.setMyRef(letterDTO.getMyRef());
        letterDetails.setSysNo(letterDTO.getSysNo());
        letterDetails.setDate(letterDTO.getDate());
        try {
            if (!file.isEmpty()){
                saveFile(file,letterDTO.getMyRef());
                System.out.println(filePath);
                LetterFile letterFile1 = new LetterFile();
                letterFile1.setFileName(filePath);
                letterDetails.setLetterFile(letterFile1);
                System.out.println("xxxxxxx"+letterDetails);
                letterFileRepository.save(letterFile1);
                letterDetailsRepository.save(letterDetails) ;
            }else {
                System.out.println("request API without File ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveFile(MultipartFile file,String myRef) throws IOException {
        File folder = new File(letterFile);

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);

        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("create a new folder");
        }
        String fileName =myRef+"_"+formattedDate ;
        System.out.println(fileName);
//        filePath = "E:/demo/fileUpload/" + ""+fileName ;
        filePath = "G:/timco/ClearFalling/clearFallingSpringBoot/fileUpload/" + ""+fileName ;
        file.transferTo(new File(filePath));
    }

    public Long getLastId() {
        return  letterDetailsRepository.getLastId()  ;
    }
}
