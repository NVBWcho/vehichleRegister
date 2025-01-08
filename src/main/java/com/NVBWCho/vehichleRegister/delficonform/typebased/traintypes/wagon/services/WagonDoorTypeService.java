package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.WagonDoorType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.concreteimplementations.BombardierTalentDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonDoorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WagonDoorTypeService {
    @Autowired


    private WagonDoorTypeRepository wagonDoorTypeRepository;

    public void   creteTestDoorType(){
        WagonDoorType wagonDoorType=new BombardierTalentDoor();
        wagonDoorTypeRepository.save(wagonDoorType);
    }

    public Optional<WagonDoorType> findDoorTypeById(Long id){
        Optional<WagonDoorType> wagonDoorType=wagonDoorTypeRepository.findById(id);
        return  wagonDoorType;
    }
}
