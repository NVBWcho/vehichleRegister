package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.RealtimeStatus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.Wagon;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.WagonBodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.WagonDoorType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonDoorTypeRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories.WagonRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonDoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WagonService {

    @Autowired
    private WagonRepository wagonRepository;

    @Autowired
    private WagonBodyTypeService wagonBodyTypeService;

    @Autowired
    private WagonDoorService wagonDoorService;

    @Autowired
    private WagonDoorTypeService wagonDoorTypeService;


    public void   creteTestWagon(){

        WagonBodyType wagonBodyType=wagonBodyTypeService.getBodyTypeById(1L);
        WagonDoorType wagonDoorType=wagonDoorTypeService.findDoorTypeById(1L).get();

        WagonDoor wagonDoor1=new WagonDoor();
        wagonDoor1.setWagonDoorType(wagonDoorType);
        wagonDoor1.setRealtimeStatus(RealtimeStatus.UNKNOWN);

        WagonDoor wagonDoor2=new WagonDoor();
        wagonDoor2.setWagonDoorType(wagonDoorType);
        wagonDoor2.setRealtimeStatus(RealtimeStatus.UNKNOWN);

        List<WagonDoor> wagonDoors=new ArrayList<>();
        wagonDoors.add(wagonDoor1);
        wagonDoors.add(wagonDoor2);

        Wagon wagon=new Wagon();

        wagon.setWagonDoors(wagonDoors);

        wagonDoor1.setWagon(wagon);
        wagonDoor2.setWagon(wagon);
        wagon.setWagonBodyType(wagonBodyType);

        wagonRepository.save(wagon);


    }
}
