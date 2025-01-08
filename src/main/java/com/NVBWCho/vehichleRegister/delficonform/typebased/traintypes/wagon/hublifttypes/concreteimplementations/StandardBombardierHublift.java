package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.hublifttypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.hublifttypes.WagonHubliftType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "bombardier_hublift")
public class StandardBombardierHublift extends WagonHubliftType {

    public  StandardBombardierHublift(){
        super();
        this.setMaxWeight_D3133(250);

    }
}
