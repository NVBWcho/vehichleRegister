package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes.WagonRampType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue(value = "bombardier_ramp")
public class BombardierRamp extends WagonRampType {

    public  BombardierRamp(){
        super();
        this.setLengthOfRamp_D3121(200);
        this.setWidthOfRamp_D3122(1200);
        this.setMaxWeight_D3123(250);
        this.setInternalRamp_D3124(true);
    }
}
