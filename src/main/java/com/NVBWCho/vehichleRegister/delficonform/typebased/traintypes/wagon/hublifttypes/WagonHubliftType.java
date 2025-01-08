package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.hublifttypes;

import jakarta.persistence.*;

@Entity
@Table(name = "wagonhublift_type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "wagonhublifttype")
public abstract class WagonHubliftType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @Column
    private Integer maxWeight_D3133;

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
}
