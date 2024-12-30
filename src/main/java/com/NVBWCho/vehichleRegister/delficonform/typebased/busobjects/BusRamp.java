package com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects;


import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.Linebus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import jakarta.persistence.*;

@Entity
@Table(name="busramp")
public class BusRamp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @ManyToOne
    @JoinColumn(name="ramptype_id")
    private RampType rampType;


    @ManyToOne
    @JoinColumn(name="linebus_id")
    private Linebus linebus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RampType getRampType() {
        return rampType;
    }

    public void setRampType(RampType rampType) {
        this.rampType = rampType;
    }

    public Linebus getLinebus() {
        return linebus;
    }

    public void setLinebus(Linebus linebus) {
        this.linebus = linebus;
    }
}
