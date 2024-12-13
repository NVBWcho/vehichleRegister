package com.NVBWCho.vehichleRegister.services.delfiservices;

import com.NVBWCho.vehichleRegister.delficonform.bus.Bus;
import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.bus.ramp.Ramp;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeOne;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeTwo;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardRamp;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.bustypes.StandardLowFloorBus;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.busramprepository.StandardRampRepository;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.bustyperepository.StandardLowFloorBusRepository;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.doorrepository.StandardTypeOneDoorRepository;
import com.NVBWCho.vehichleRegister.repository.delfibusrepository.doorrepository.StandardTypeTwoDoorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private StandardLowFloorBusRepository standardLowFloorBusRepository;

    @Autowired

    private StandardTypeOneDoorRepository standardTypeOneDoorRepository;


    @Autowired
    private StandardTypeTwoDoorRepository standardTypeTwoDoorRepository;

    @Autowired
    private StandardRampRepository standardRampRepository;



    public void  createTesBus(){

        StandardDoorTypeOne standardDoorTypeOne=new StandardDoorTypeOne();

        StandardDoorTypeTwo standardDoorTypeTwo=new StandardDoorTypeTwo();

        StandardRamp standardRamp=new StandardRamp();

        List<Door> doors=new ArrayList<>();
        List<Ramp> ramps=new ArrayList<>();
        doors.add(standardDoorTypeOne);
        doors.add(standardDoorTypeTwo);
        ramps.add(standardRamp);

        StandardLowFloorBus standardLowFloorBus=new StandardLowFloorBus();

        standardDoorTypeOne.setBus(standardLowFloorBus);
        standardDoorTypeTwo.setBus(standardLowFloorBus);
        standardRamp.setBus(standardLowFloorBus);
        standardLowFloorBus.setRamps(ramps);

        standardLowFloorBusRepository.save(standardLowFloorBus);

        standardTypeOneDoorRepository.save(standardDoorTypeOne);
        standardTypeTwoDoorRepository.save(standardDoorTypeTwo);
        standardRampRepository.save(standardRamp);


    }

    public Optional<Bus> getBusById(Long busId){
        Optional<StandardLowFloorBus> lowFloorBusbus=standardLowFloorBusRepository.findById(busId);
        if(lowFloorBusbus.isPresent()){
            Bus bus=lowFloorBusbus.get();

            System.out.println(bus.getHeightOfStairs_D3111());

            return Optional.of(bus);

        }else{
            return  Optional.empty();
        }


    }


}
