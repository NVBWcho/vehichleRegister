package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes;


import com.NVBWCho.vehichleRegister.delficonform.typebased.TypeOfDoorOpening;
import jakarta.persistence.*;

@Entity
@Table(name = "wagondoortype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class WagonDoorType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @Column
    private TypeOfDoorOpening openingType_D3040;

    @Column
    private Integer widthOfDoor_D3041;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfDoorOpening getOpeningType_D3040() {
        return openingType_D3040;
    }

    public void setOpeningType_D3040(TypeOfDoorOpening openingType_D3040) {
        this.openingType_D3040 = openingType_D3040;
    }

    public Integer getWidthOfDoor_D3041() {
        return widthOfDoor_D3041;
    }

    public void setWidthOfDoor_D3041(Integer widthOfDoor_D3041) {
        this.widthOfDoor_D3041 = widthOfDoor_D3041;
    }

    @Override
    public String toString() {
        return "WagonDoorType{" +
                "openingType_D3040=" + openingType_D3040 +
                ", widthOfDoor_D3041=" + widthOfDoor_D3041 +
                '}';
    }
}
