package com.NVBWCho.vehichleRegister.experimental.bus;


import com.NVBWCho.vehichleRegister.experimental.door.BusDoor;

import java.util.ArrayList;

public abstract class Bus {

    public String id;

    public ArrayList<BusDoor> busDoors;


    public Integer length;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<BusDoor> getBusDoors() {
        return busDoors;
    }

    public void setBusDoors(ArrayList<BusDoor> busDoors) {
        this.busDoors = busDoors;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getCanKneel() {
        return canKneel;
    }

    public void setCanKneel(Boolean canKneel) {
        this.canKneel = canKneel;
    }

    public  Boolean canKneel;





}
