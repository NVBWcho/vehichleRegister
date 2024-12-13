package com.NVBWCho.vehichleRegister.delficonform.bus.door;

import com.NVBWCho.vehichleRegister.delficonform.bus.Bus;
import jakarta.persistence.*;




@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)



public abstract class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private typeOfDoorOpening openingType_D3040;


    @Column
    private Integer widthOfDoor_D3041;


    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Bus getDelfiConformBus() {
        return bus;
    }

    public void setDelfiConformBus(Bus bus) {
        this.bus = bus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public typeOfDoorOpening getOpeningType() {
        return openingType_D3040;
    }

    public void setOpeningType(typeOfDoorOpening openingType) {
        this.openingType_D3040 = openingType;
    }

    public Integer getWidthOfDoor() {
        return widthOfDoor_D3041;
    }

    public void setWidthOfDoor(Integer widthOfDoor) {
        this.widthOfDoor_D3041 = widthOfDoor;
    }
}
