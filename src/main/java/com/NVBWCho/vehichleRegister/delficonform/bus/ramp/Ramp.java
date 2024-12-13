package com.NVBWCho.vehichleRegister.delficonform.bus.ramp;


import com.NVBWCho.vehichleRegister.delficonform.bus.Bus;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Ramp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Integer lengthOfRamp_D3121;


    @Column
    private Integer widthOfRamp_D3122;


    @Column
    private Double maxWeight_D3123;


    @Column
    private Boolean rampInInterior_D3124;


    @ManyToOne
    @JoinColumn(name="bus_id")

    private Bus bus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLengthOfRamp_D3121() {
        return lengthOfRamp_D3121;
    }

    public void setLengthOfRamp_D3121(Integer lengthOfRamp_D3121) {
        this.lengthOfRamp_D3121 = lengthOfRamp_D3121;
    }

    public Integer getWidthOfRamp_D3122() {
        return widthOfRamp_D3122;
    }

    public void setWidthOfRamp_D3122(Integer widthOfRamp_D3122) {
        this.widthOfRamp_D3122 = widthOfRamp_D3122;
    }

    public Double getMaxWeight_D3123() {
        return maxWeight_D3123;
    }

    public void setMaxWeight_D3123(Double maxWeight_D3123) {
        this.maxWeight_D3123 = maxWeight_D3123;
    }

    public Boolean getRampInInterior_D3124() {
        return rampInInterior_D3124;
    }

    public void setRampInInterior_D3124(Boolean rampInInterior_D3124) {
        this.rampInInterior_D3124 = rampInInterior_D3124;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
