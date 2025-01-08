package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects;


import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.RealtimeStatus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.Wagon;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes.WagonRampType;
import jakarta.persistence.*;

@Entity
@Table(name = "wagonramp")
public class WagonRamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @ManyToOne
    @JoinColumn(name = "wagonramptype_id")
    private WagonRampType wagonRampType;

    @ManyToOne
    @JoinColumn(name = "wagon_id")
    private Wagon wagon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WagonRampType getWagonRampType() {
        return wagonRampType;
    }

    public void setWagonRampType(WagonRampType wagonRampType) {
        this.wagonRampType = wagonRampType;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public RealtimeStatus getRealtimeStatus() {
        return realtimeStatus;
    }

    public void setRealtimeStatus(RealtimeStatus realtimeStatus) {
        this.realtimeStatus = realtimeStatus;
    }

    @Column
    private RealtimeStatus realtimeStatus;


    @Override
    public String toString() {
        return "WagonRamp{" +
                "wagonRampType=" + wagonRampType +
                '}';
    }
}
