package com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus;

import com.NVBWCho.vehichleRegister.delficonform.bus.Hublift;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("standard_bus_hublift")
public class StandardHublift extends Hublift {

    public StandardHublift(){
        super();

        this.setMaxWeight_D3133(150);
    }
}
