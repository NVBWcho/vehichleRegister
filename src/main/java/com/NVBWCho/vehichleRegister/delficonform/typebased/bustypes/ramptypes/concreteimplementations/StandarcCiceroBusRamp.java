package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("standard_cicero_busramp")
public class StandarcCiceroBusRamp extends RampType {

    public StandarcCiceroBusRamp(){
        super();
        this.setLengthOfRamp_D3121(10);
        this.setWidthOfRamp_D3122(10);
        this.setMaxWeight_D3123(100);
        this.setInternalRamp_D3124(true);
    }
}
