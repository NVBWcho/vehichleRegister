package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonDoorRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonDoor;
import org.springframework.stereotype.Service;


@Service
public class WagonDoorService {

    private WagonDoorRepository wagonDoorRepository;

    public void saveDoor(WagonDoor wagonDoor){
        wagonDoorRepository.save(wagonDoor);
    }
}
