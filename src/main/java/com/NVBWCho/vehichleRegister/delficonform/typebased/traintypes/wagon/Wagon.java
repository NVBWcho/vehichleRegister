package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon;


import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.WagonBodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonRamp;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "wagon")
public class Wagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @Column
    private Integer wagonNumberForTrain;



    @ManyToOne
    @JoinColumn(name = "wagonbodytype_id")

    private WagonBodyType wagonBodyType;

    @OneToMany(mappedBy = "wagon",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<WagonDoor> wagonDoors;

    @OneToMany(mappedBy = "wagon",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<WagonRamp> wagonRamps;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWagonNumberForTrain() {
        return wagonNumberForTrain;
    }

    public void setWagonNumberForTrain(Integer wagonNumberForTrain) {
        this.wagonNumberForTrain = wagonNumberForTrain;
    }

    public WagonBodyType getWagonBodyType() {
        return wagonBodyType;
    }

    public void setWagonBodyType(WagonBodyType wagonBodyType) {
        this.wagonBodyType = wagonBodyType;
    }

    public List<WagonDoor> getWagonDoors() {
        return wagonDoors;
    }

    public void setWagonDoors(List<WagonDoor> wagonDoors) {
        this.wagonDoors = wagonDoors;
    }

    public List<WagonRamp> getWagonRamps() {
        return wagonRamps;
    }

    public void setWagonRamps(List<WagonRamp> wagonRamps) {
        this.wagonRamps = wagonRamps;
    }
}
