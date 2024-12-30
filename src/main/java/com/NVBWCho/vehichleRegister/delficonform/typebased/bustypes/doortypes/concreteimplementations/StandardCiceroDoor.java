package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.typeOfDoorOpening;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.BusDoorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("busdoor_cicero")

public class StandardCiceroDoor extends BusDoorType {

    public  StandardCiceroDoor(){
        super();
        this.setDoortypeAbbreviation("standardCiceroDoor");
        this.setWidthOfDoor_D3041(10);
        this.setOpeningType_D3040(typeOfDoorOpening.AUTOMATIC);
    }


}
