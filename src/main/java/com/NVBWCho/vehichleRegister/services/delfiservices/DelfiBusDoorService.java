package com.NVBWCho.vehichleRegister.services.delfiservices;


import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeOne;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeTwo;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.DelfiBusDoorTypeOneRepository;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.DelfiBusDoorTypeTwoRepository;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.doorrepository.DoorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DelfiBusDoorService {

    @Autowired

    private DelfiBusDoorTypeOneRepository delfiBusDoorTypeOneRepository;

    @Autowired

    private DelfiBusDoorTypeTwoRepository delfiBusDoorTypeTwoRepository;


    @Autowired
    private DoorRepository doorRepository;


    public  void createTestDoors(){
        System.out.println("creating doors");

        StandardDoorTypeOne standardDoorTypeOne=new StandardDoorTypeOne();
        StandardDoorTypeTwo standardDoorTypeTwo=new StandardDoorTypeTwo();

        delfiBusDoorTypeOneRepository.save(standardDoorTypeOne);
        delfiBusDoorTypeTwoRepository.save(standardDoorTypeTwo);
    }

    public void getTypeOneDoorsByBusId(Long busId){

        List<Door> doors=delfiBusDoorTypeOneRepository.findDoorsByBusId(busId);

        if(doors.size()>0){
            System.out.println(doors);
            System.out.println(doorRepository.findAll());
        }else {
            System.out.println("no doors found");
        }


    }




}
