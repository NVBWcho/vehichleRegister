package com.NVBWCho.vehichleRegister.services.experimental;

import com.NVBWCho.vehichleRegister.experimental.persistedentities.StandardRampTypeZero;
import com.NVBWCho.vehichleRegister.repository.StandardRampTypeZeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StandardRampZeroService {

    @Autowired
    private StandardRampTypeZeroRepository standardRampZeroRepository;


    public void createTestRamp(){

        StandardRampTypeZero standardRampTypeZero=new StandardRampTypeZero();
        standardRampZeroRepository.save(standardRampTypeZero);

    }

}
