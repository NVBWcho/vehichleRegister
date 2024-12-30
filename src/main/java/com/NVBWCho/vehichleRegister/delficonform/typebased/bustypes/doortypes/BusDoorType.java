package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.typeOfDoorOpening;
import jakarta.persistence.*;


@Entity
@Table(name="busdoortype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="busdoor_type")
public abstract class BusDoorType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    @Column
    private String doortypeAbbreviation;

    @Column
    private typeOfDoorOpening openingType_D3040;


    @Column
    private Integer widthOfDoor_D3041;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoortypeAbbreviation() {
        return doortypeAbbreviation;
    }

    public void setDoortypeAbbreviation(String doortypeAbbreviation) {
        this.doortypeAbbreviation = doortypeAbbreviation;
    }

    public typeOfDoorOpening getOpeningType_D3040() {
        return openingType_D3040;
    }

    public void setOpeningType_D3040(typeOfDoorOpening openingType_D3040) {
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
        return "BusDoorType{" +
                "id=" + id +
                ", doortypeAbbreviation='" + doortypeAbbreviation + '\'' +
                ", openingType_D3040=" + openingType_D3040 +
                '}';
    }
}
