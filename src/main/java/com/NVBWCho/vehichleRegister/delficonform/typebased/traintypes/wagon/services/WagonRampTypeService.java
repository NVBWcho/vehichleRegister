package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes.WagonRampType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes.concreteimplementations.BombardierRamp;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonRampTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WagonRampTypeService {

    @Autowired
    private WagonRampTypeRepository wagonRampTypeRepository;

    public void createTestRampType(){
        WagonRampType wagonRampType=new BombardierRamp();
        wagonRampTypeRepository.save(wagonRampType);
    }

    public WagonRampType getWagonRampTypeById(Long id){
        Optional<WagonRampType> wagonRampType=wagonRampTypeRepository.findById(1L);
        return  wagonRampType.get();
    }
}
