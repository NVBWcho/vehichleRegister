package com.NVBWCho.vehichleRegister.experimental.persistedentities;

import com.NVBWCho.vehichleRegister.experimental.ramp.BusRampTest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("standardtype_zero")

@Getter
@Setter




public class StandardRampTypeZero extends BusRampTest {






    public StandardRampTypeZero(){

        super();
        this.setWidth(66);
        this.setLength(5);
        this.setSlope(5.0);


    }





}
