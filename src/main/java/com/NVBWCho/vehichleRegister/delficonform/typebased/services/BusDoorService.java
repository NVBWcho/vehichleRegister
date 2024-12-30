package com.NVBWCho.vehichleRegister.delficonform.typebased.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusDoorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BusDoorService {

    @Autowired
    BusDoorRepository busDoorRepository;

    public void saveBusDoor(BusDoor busDoor){

        busDoorRepository.save(busDoor);

    }
}
