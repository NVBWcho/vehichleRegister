package com.NVBWCho.vehichleRegister.experimental.persistedentities;

import com.NVBWCho.vehichleRegister.experimental.ramp.BusRamp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("standardtype_one")


@Getter
@Setter

public class StandardRampTypeOne extends BusRamp {

    public StandardRampTypeOne(){
        super();
        this.setWidth(70);
        this.setLength(8);
        this.setSlope(4.0);
    }


}