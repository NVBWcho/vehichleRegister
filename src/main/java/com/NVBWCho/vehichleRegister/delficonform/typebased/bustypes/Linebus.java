package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes;


import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "linebus")
public class Linebus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    public List<BusDoor> getDoors() {
        return doors;
    }

    public void setDoors(List<BusDoor> doors) {
        this.doors = doors;
    }

    @ManyToOne
    @JoinColumn(name="busbodytype_id")
    private BodyType bodyType;


    @OneToMany(mappedBy = "linebus",cascade = CascadeType.ALL,fetch = FetchType.EAGER)

    private List<BusDoor> doors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Linebus{" +
                "id=" + id +
                ", bodyType=" + bodyType.getBodytypeAbbreviation() +
                ", doors=" + doors +
                '}';
    }
}
