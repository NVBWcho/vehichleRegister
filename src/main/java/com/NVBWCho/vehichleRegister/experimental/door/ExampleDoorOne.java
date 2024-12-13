package com.NVBWCho.vehichleRegister.experimental.door;

import com.NVBWCho.vehichleRegister.experimental.ramp.BusRamp;

import java.util.Optional;

public class ExampleDoorOne extends BusDoor {

    public Integer getDistanceToBusHead() {
        return distanceToBusHead;
    }

    public void setDistanceToBusHead(Integer distanceToBusHead) {
        this.distanceToBusHead = distanceToBusHead;
    }

    private Integer distanceToBusHead;

    public ExampleDoorOne (String id, Optional<BusRamp> exampleRampOne,Integer distanceToBusHead){



        super();
        this.setHeight(10);
        this.setWidth(5);
        this.setId(id);
        this.setHeightFromGroundWithKneeling(5);
        this.setHeightFromGroundWithoutKneeling(8);
        this.setAttachedRamp(exampleRampOne);
        this.setEquippedWithRamp(true);
        Optional<String> doorname=Optional.of("doorOne");
        this.setDoorname(doorname);
        this.distanceToBusHead=distanceToBusHead;


    }
}
