package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes;


import jakarta.persistence.*;
import org.springframework.context.annotation.ImportRuntimeHints;

@Entity
@Table(name="ramptype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="busramp_type")
public abstract class RampType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    @Column
    private Integer widthOfRamp_D3122 ;


    @Column
    private Integer lengthOfRamp_D3121;

    @Column
    private Integer maxWeight_D3123;


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
}
