package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;


import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonRampRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonRamp;
import org.springframework.stereotype.Service;

@Service
public class WagonRampService {

    private WagonRampRepository wagonRampRepository;

    public void saveRamp(WagonRamp wagonRamp){
        wagonRampRepository.save(wagonRamp);
    }
}
