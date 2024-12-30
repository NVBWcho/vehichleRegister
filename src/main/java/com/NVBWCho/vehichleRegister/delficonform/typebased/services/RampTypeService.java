package com.NVBWCho.vehichleRegister.delficonform.typebased.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.concreteimplementations.StandarcCiceroBusRamp;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusRampTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RampTypeService {

    @Autowired
    private BusRampTypeRepository busRampTypeRepository;

    public void createTestRampType(){

        RampType rampType=new StandarcCiceroBusRamp();

        busRampTypeRepository.save(rampType);
    }

}
