package com.NVBWCho.vehichleRegister.experimental.door;

import com.NVBWCho.vehichleRegister.experimental.ramp.BusRampTest;

import java.util.Optional;

enum typeOfDoorOpening{
    AUTOMATIC,
    MANUAL,
    HALFAUTOMATIC
}

public abstract class BusDoor {

    private String id;

    public typeOfDoorOpening currentTypeOfDoorOpening;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeightFromGroundWithoutKneeling() {
        return heightFromGroundWithoutKneeling;
    }

    public void setHeightFromGroundWithoutKneeling(Integer heightFromGroundWithoutKneeling) {
        this.heightFromGroundWithoutKneeling = heightFromGroundWithoutKneeling;
    }

    public Integer getHeightFromGroundWithKneeling() {
        return heightFromGroundWithKneeling;
    }

    public void setHeightFromGroundWithKneeling(Integer heightFromGroundWithKneeling) {
        this.heightFromGroundWithKneeling = heightFromGroundWithKneeling;
    }

    public boolean isEquippedWithRamp() {
        return isEquippedWithRamp;
    }

    public void setEquippedWithRamp(boolean equippedWithRamp) {
        isEquippedWithRamp = equippedWithRamp;
    }

    public Optional<BusRampTest> getAttachedRamp() {
        return attachedRamp;
    }

    public void setAttachedRamp(Optional<BusRampTest> attachedRamp) {
        this.attachedRamp = attachedRamp;
    }

    public Optional<String> getDoorname() {

        return doorname;
    }

    public void setDoorname(Optional<String> doorname) {
        this.doorname = doorname;
    }

    private Integer width;
    private Integer height;

    private Integer heightFromGroundWithoutKneeling;

    private Integer heightFromGroundWithKneeling;

    private boolean isEquippedWithRamp;

    private Optional<BusRampTest> attachedRamp;
    private  Optional<String> doorname;

    public  BusDoor(){

    }


}
