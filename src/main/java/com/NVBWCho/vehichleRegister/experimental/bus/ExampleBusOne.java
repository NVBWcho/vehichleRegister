package com.NVBWCho.vehichleRegister.experimental.bus;

import com.NVBWCho.vehichleRegister.experimental.door.BusDoor;

import java.util.ArrayList;

public class ExampleBusOne extends Bus {

    public ExampleBusOne(String id,ArrayList<BusDoor> doors){

        super();
        this.id=id;
        this.busDoors=doors;
        this.setCanKneel(true
        );


    }
}
