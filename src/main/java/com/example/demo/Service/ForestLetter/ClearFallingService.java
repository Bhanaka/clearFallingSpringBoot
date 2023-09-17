package com.example.demo.Service.ForestLetter;

import com.example.demo.Models.ForestLetter.ExcelFile;
import com.example.demo.Repository.ForestLetter.LetterExcelFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class ClearFallingService {
    private final String excelFile = "ExcelFile";
    private String filePath ;
    @Autowired
    private LetterExcelFileRepository letterExcelFileRepository ;

    public void ClearFallingXlFile(MultipartFile file, String systemNo) {

        try {
            if (!file.isEmpty()){
               saveExcel(file,systemNo);
                ExcelFile excelFile1 = new ExcelFile();
                excelFile1.setFileName(filePath);
               letterExcelFileRepository.save(excelFile1);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void saveExcel(MultipartFile file, String systemNo) throws IOException {
        File folder = new File(excelFile);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("create a new folder");
        }
        String fileName ="Excel_"+systemNo+"_"+formattedDate ;
        System.out.println(fileName);
        filePath = "E:/demo/ExcelFile/"+fileName ;
        file.transferTo(new File(filePath));
    }
}
