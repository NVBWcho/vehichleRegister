package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.ramptypes;


import jakarta.persistence.*;

@Entity
@Table(name = "wagonramptype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "wagonramp_type")
public abstract class  WagonRampType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Integer widthOfRamp_D3122 ;


    @Column
    private Integer lengthOfRamp_D3121;

    @Column
    private Integer maxWeight_D3123;

    @Column
    private Boolean internalRamp_D3124;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWidthOfRamp_D3122() {
        return widthOfRamp_D3122;
    }

    public void setWidthOfRamp_D3122(Integer widthOfRamp_D3122) {
        this.widthOfRamp_D3122 = widthOfRamp_D3122;
    }

    public Integer getLengthOfRamp_D3121() {
        return lengthOfRamp_D3121;
    }

    public void setLengthOfRamp_D3121(Integer lengthOfRamp_D3121) {
        this.lengthOfRamp_D3121 = lengthOfRamp_D3121;
    }

    public Integer getMaxWeight_D3123() {
        return maxWeight_D3123;
    }

    public void setMaxWeight_D3123(Integer maxWeight_D3123) {
        this.maxWeight_D3123 = maxWeight_D3123;
    }

    public Boolean getInternalRamp_D3124() {
        return internalRamp_D3124;
    }

    public void setInternalRamp_D3124(Boolean internalRamp_D3124) {
        this.internalRamp_D3124 = internalRamp_D3124;
    }

    @Override
    public String toString() {
        return "WagonRampType{" +
                "widthOfRamp_D3122=" + widthOfRamp_D3122 +
                ", lengthOfRamp_D3121=" + lengthOfRamp_D3121 +
                ", maxWeight_D3123=" + maxWeight_D3123 +
                ", internalRamp_D3124=" + internalRamp_D3124 +
                '}';
    }
}