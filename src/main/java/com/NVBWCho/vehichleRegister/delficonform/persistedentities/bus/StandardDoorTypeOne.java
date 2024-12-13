package com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.bus.door.typeOfDoorOpening;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("standardDelfiDoor_type1")

public class StandardDoorTypeOne extends Door {


    @Override
    public String toString() {
        return "StandardDoorTypeOne"+this.getId()+" of "+this.getBus().getId();
    }

    public StandardDoorTypeOne(){

        super();
         this.setWidthOfDoor(10);
         this.setOpeningType(typeOfDoorOpening.AUTOMATIC);
    }
}
