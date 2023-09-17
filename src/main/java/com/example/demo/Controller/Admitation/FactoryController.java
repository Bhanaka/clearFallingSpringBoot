package com.example.demo.Controller.Admitation;

import com.example.demo.DTO.Factories.DepostDTO;
import com.example.demo.DTO.Factories.RegionDTO;
import com.example.demo.Models.Factories.Depost;
import com.example.demo.Models.Factories.Region;
import com.example.demo.Repository.Admintation.Factory.DepostRepository;
import com.example.demo.Repository.Admintation.Factory.RegionRepository;
import com.example.demo.Service.Admintation.Factory.DepostService;
import com.example.demo.Service.Admintation.Factory.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/factory")
public class FactoryController {
    @Autowired
    private RegionService regionService ;
    @Autowired
    private RegionRepository regionRepository ;
    @Autowired
    private DepostRepository depostRepository;
    @Autowired
    private DepostService depostService;

    @PostMapping("/insertDepost")
    public ResponseEntity <String> InsertDepost(@RequestBody DepostDTO depostDTO){
        Depost depost =new Depost();
        depost.setDepostCode(depostDTO.getDepostCode());
        depost.setDepostName(depostDTO.getDepostName());
        Region region = regionRepository.fetchRegion(depostDTO.getRegionCode());
        depost.setRegionCode(region);
        depostService.insertDepost(depost);
        String responseData = "Successfully insert region" ;
        return ResponseEntity.status(HttpStatus.OK).body(responseData);

    }
    @GetMapping("/getAllDepost")
    public void GetAllDeposts(){

    }
    @PostMapping("/insertRegion")
    public ResponseEntity <String> InsertRegion(@RequestBody RegionDTO regionDTO){
        Region region = new Region();
        region.setRegionCode(regionDTO.getRegionCode());
        region.setRegionName(regionDTO.getRegionName());
        regionService.insertRegion(region) ;
        String responseData = "Successfully insert region" ;
        return ResponseEntity.status(HttpStatus.OK).body(responseData);
    }
    @GetMapping("/getAllRegions")
    public List<Region> GetAllRegions(){
        return regionService.getAllRegions() ;
    }

}
