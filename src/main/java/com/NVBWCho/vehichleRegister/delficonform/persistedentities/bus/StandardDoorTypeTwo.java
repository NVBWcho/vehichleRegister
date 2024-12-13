package com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.bus.door.typeOfDoorOpening;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity

@DiscriminatorValue("standardDelfiDoor_type2")
public class StandardDoorTypeTwo extends Door {


    public StandardDoorTypeTwo(){
        super();
        this.setWidthOfDoor(10);
        this.setOpeningType(typeOfDoorOpening.MANUAL);
    }

    @Override
    public String toString() {
        return "StandardDoorTypeTwo "+this.getId();
    }
}
