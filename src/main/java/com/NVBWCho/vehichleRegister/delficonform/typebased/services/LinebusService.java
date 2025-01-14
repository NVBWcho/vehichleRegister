package com.NVBWCho.vehichleRegister.delficonform.typebased.services;

import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusRamp;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.Linebus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.BusDoorType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.concreteimplementations.StandardCiceroDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BodyTypeRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusDoorRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.BusRampTypeRepository;
import com.NVBWCho.vehichleRegister.delficonform.typebased.repositories.LinebusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LinebusService {

    @Autowired
    private BodyTypeRepository bodyTypeRepository;

    @Autowired
    private LinebusRepository linebusRepository;

    @Autowired

    private BodyTypeService bodyTypeService;

    @Autowired

    private BusDoorTypeService busDoorTypeService;

    @Autowired
    private BusRampTypeService busRampTypeService;


    @Autowired


    private BusDoorRepository busDoorRepository;

    public void createTestBus(){

        BodyType bodyType=bodyTypeService.getBodyTypeByBodyId(1L);

        BusDoor busDoor=new BusDoor();
        BusDoor busDoor1=new BusDoor();
        List<BusDoor> busDoors=new ArrayList<>();
        busDoors.add(busDoor);
        busDoors.add(busDoor1);

        BusRamp busRamp=new BusRamp();
        Optional<RampType> rampType=busRampTypeService.getRamptypeById(1L);

        busRamp.setRampType(rampType.get());

        List<BusRamp> ramps=new ArrayList<>();
        ramps.add(busRamp);





        BusDoorType busDoorType=busDoorTypeService.getBusDoorTypeById(1L);

        busDoor.setBusDoorType(busDoorType);
        busDoor1.setBusDoorType(busDoorType);


        Linebus linebus=new Linebus();
        // setting the bi-directional relationships explicitly

        linebus.setDoors(busDoors);
        linebus.setRamps(ramps);

        busDoor.setLinebus(linebus); // Set Linebus in BusDoor
        busDoor1.setLinebus(linebus);

        busRamp.setLinebus(linebus);




        linebus.setBodyType(bodyType);


        linebusRepository.save(linebus);







    }


    public Linebus getLineBusById(Long id){
        Optional<Linebus> linebus=linebusRepository.findById(id);

        return linebus.get();
    }
}
