package com.example.demo.Repository.Admintation.Factory;

import com.example.demo.Models.Factories.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    @Query(value = "SELECT * FROM `region` WHERE `region_code` = ?1",nativeQuery = true)
    Region fetchRegion(String code);
}
