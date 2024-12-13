package com.NVBWCho.vehichleRegister.experimental.ramp;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ramp_type",discriminatorType = DiscriminatorType.STRING)
public abstract class BusRamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Integer width;

    private Double slope;

    private Integer length;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Double getSlope() {
        return slope;
    }

    public void setSlope(Double slope) {
        this.slope = slope;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
