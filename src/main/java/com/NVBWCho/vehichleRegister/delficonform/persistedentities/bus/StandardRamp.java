package com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus;

import com.NVBWCho.vehichleRegister.delficonform.bus.ramp.Ramp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("standard_busramp_zero")
public class StandardRamp extends Ramp {

    public  StandardRamp(){
        super();
        this.setLengthOfRamp_D3121(2);
        this.setWidthOfRamp_D3122(2);
        this.setRampInInterior_D3124(true);
        this.setMaxWeight_D3123(100.0);

    }
}
