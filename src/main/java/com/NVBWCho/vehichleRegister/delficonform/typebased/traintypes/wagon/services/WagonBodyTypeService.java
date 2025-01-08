package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.WagonBodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.concreteimplementations.BombardierTalent;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonBodyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WagonBodyTypeService {


    @Autowired
    private WagonBodyTypeRepository wagonBodyTypeRepository;

    public void createTestBody(){
        WagonBodyType wagonBodyType=new BombardierTalent();
        wagonBodyTypeRepository.save(wagonBodyType);
    }

    public WagonBodyType getBodyTypeById(Long id){
        Optional<WagonBodyType> wagonBodyType=wagonBodyTypeRepository.findById(id);
        return  wagonBodyType.get();
    }
}
