package com.NVBWCho.vehichleRegister.delficonform.typebased.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.BusDoorType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.concreteimplementations.StandardCiceroDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusDoorRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusDoorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusDoorTypeService {

    @Autowired
    private BusDoorTypeRepository busDoorTypeRepository;

    public void createTestDoorType(){
        BusDoorType busDoorType=new StandardCiceroDoor();

        busDoorTypeRepository.save(busDoorType);
    }


    public void getExistingDoorTypes(){

        List<BusDoorType> allDoorTypes=busDoorTypeRepository.findAll();
        allDoorTypes.forEach(doorType ->{
            System.out.println(doorType);
        });

    }

    public BusDoorType getBusDoorTypeById(Long id){
        Optional<BusDoorType> busDoorType=busDoorTypeRepository.findById(id);
        return  busDoorType.get();
    }





}
