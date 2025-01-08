package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects;


import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.RealtimeStatus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.Wagon;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.WagonDoorType;
import jakarta.persistence.*;

@Entity
@Table(name = "wagondoor")
public class WagonDoor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @ManyToOne
    @JoinColumn(name = "wagondoortype_id")
    private WagonDoorType wagonDoorType;

    @ManyToOne
    @JoinColumn(name = "wagon_id")
    private Wagon wagon;

    @Column
    private RealtimeStatus realtimeStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WagonDoorType getWagonDoorType() {
        return wagonDoorType;
    }

    public void setWagonDoorType(WagonDoorType wagonDoorType) {
        this.wagonDoorType = wagonDoorType;
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

    @Override
    public String toString() {
        return "WagonDoor{" +
                "wagonDoorType=" + wagonDoorType +
                '}';
    }
}
