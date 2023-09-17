package com.example.demo.Service.Admintation.Factory;

import com.example.demo.Models.Factories.Depost;
import com.example.demo.Repository.Admintation.Factory.DepostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepostService {
    @Autowired
    private DepostRepository depostRepository ;
    public Depost insertDepost(Depost depost){
        return depostRepository.save(depost) ;
    }
}
