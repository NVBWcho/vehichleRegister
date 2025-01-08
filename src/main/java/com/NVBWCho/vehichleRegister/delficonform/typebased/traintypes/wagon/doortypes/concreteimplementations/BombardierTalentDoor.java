package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.WagonDoorType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.TypeOfDoorOpening;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue(value = "bombardier_talent")
public class BombardierTalentDoor extends WagonDoorType {

    public BombardierTalentDoor(){
        super();
        this.setWidthOfDoor_D3041(1300);
        this.setOpeningType_D3040(TypeOfDoorOpening.AUTOMATIC);
    }
}
