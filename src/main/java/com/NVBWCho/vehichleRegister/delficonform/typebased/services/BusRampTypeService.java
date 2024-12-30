package com.NVBWCho.vehichleRegister.delficonform.typebased.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.concreteimplementations.StandarcCiceroBusRamp;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusRampTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusRampTypeService {

    @Autowired
    private BusRampTypeRepository busRampTypeRepository;

    public void createTestRampType(){

        RampType rampType=new StandarcCiceroBusRamp();

        busRampTypeRepository.save(rampType);
    }

    public List<RampType> getAvailableRampTypes(){

        List<RampType> rampTypes=busRampTypeRepository.findAll();

        return rampTypes;

    }


    public Optional<RampType> getRamptypeById(Long id){
        Optional<RampType> rampType=busRampTypeRepository.findById(1L);
        return rampType;
    }

}
