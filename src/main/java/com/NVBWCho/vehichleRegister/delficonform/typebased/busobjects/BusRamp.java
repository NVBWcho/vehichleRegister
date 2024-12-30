package com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="busramp")
public class BusRamp {

    private Long id;


    @ManyToOne
    @JoinColumn(name="ramptype_id")
    private RampType rampType;


}
