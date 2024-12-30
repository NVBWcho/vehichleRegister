package com.NVBWCho.vehichleRegister.delficonform.typebased.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.concreteimplementations.CiceroTypeOne;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BodyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BodyTypeService {

    @Autowired

    private BodyTypeRepository bodyTypeRepository;

    public void createTestBusBody(){

        BodyType bodyType=new CiceroTypeOne();

        bodyTypeRepository.save(bodyType);
    }

    public BodyType getBodyTypeByBodyId(Long bodyId){
       Optional< BodyType> bodyType=bodyTypeRepository.findById(1L);
        return  bodyType.get();
    }


}
