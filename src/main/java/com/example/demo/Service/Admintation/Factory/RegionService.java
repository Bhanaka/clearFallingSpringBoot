package com.example.demo.Service.Admintation.Factory;

import com.example.demo.Models.Factories.Region;
import com.example.demo.Repository.Admintation.Factory.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository ;
    public Region insertRegion(Region region){
        return regionRepository.save(region) ;
    }
    public List<Region> getAllRegions(){
        return regionRepository.findAll() ;
    }
}
