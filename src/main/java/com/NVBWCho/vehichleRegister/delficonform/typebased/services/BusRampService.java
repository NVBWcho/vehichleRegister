package com.NVBWCho.vehichleRegister.delficonform.typebased.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusRamp;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusRampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusRampService {


    @Autowired
    private BusRampRepository busRampRepository;

    public void savaBusRamp(BusRamp busRamp) {
        busRampRepository.save(busRamp);

    }
}
