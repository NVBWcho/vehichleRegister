package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.hubliftypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.hubliftypes.HubliftType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue(value = "hublift_standard")
public class StandardBusHublift extends HubliftType {

    public  StandardBusHublift(){
        super();
        this.setMaxWeight_D3133(150);
    }



}
