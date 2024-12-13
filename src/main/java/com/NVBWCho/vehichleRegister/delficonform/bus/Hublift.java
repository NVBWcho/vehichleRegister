package com.NVBWCho.vehichleRegister.delficonform.bus;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Hublift {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column
    private Integer maxWeight_D3133;


    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMaxWeight_D3133() {
        return maxWeight_D3133;
    }

    public void setMaxWeight_D3133(Integer maxWeight_D3133) {
        this.maxWeight_D3133 = maxWeight_D3133;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
