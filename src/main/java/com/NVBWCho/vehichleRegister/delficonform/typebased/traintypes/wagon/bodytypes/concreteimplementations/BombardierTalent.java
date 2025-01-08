package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.WagonBodyType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue(value = "bombardier_Talent3")
public class BombardierTalent extends WagonBodyType {

    public BombardierTalent(){
        super();
        this.setAccessibleToiletAvailable_D3061(true);
        this.setAreaForMobilityRestrictedAvailable_D3050(true);
        this.setHasStairs_D3110(false);
        this.setInformationDisplayExternal_D3021(true);
        this.setInformationDisplayInternal_D3020(true);
        this.setWidthOfWagonAtDoor_D3090(2925);
        this.setMinimumHeightOfFloorFromGround_D3100(590);
        setWagonTypeAbbreviation("bomdardier_talent_three");


    }
}
