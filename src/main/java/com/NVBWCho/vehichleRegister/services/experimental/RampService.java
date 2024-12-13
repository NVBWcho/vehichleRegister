package com.NVBWCho.vehichleRegister.services.experimental;


import com.NVBWCho.vehichleRegister.experimental.persistedentities.StandardRampTypeOne;
import com.NVBWCho.vehichleRegister.experimental.persistedentities.StandardRampTypeZero;
import com.NVBWCho.vehichleRegister.repository.StandardRampTypeOneRepository;
import com.NVBWCho.vehichleRegister.repository.StandardRampTypeZeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RampService {

    @Autowired

    private StandardRampTypeZeroRepository standardRampTypeZeroRepository;

    @Autowired

    private StandardRampTypeOneRepository standardRampTypeOneRepository;

    public void createTestRamp(){
        StandardRampTypeZero standardRampTypeZero=new StandardRampTypeZero();
        standardRampTypeZeroRepository.save(standardRampTypeZero);

        StandardRampTypeOne standardRampTypeOne=new StandardRampTypeOne();
        standardRampTypeOneRepository.save(standardRampTypeOne);
    }




}
