package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.bus.ramp.Ramp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="busbodytype")
public abstract class  BodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String bodytypeAbbreviation;

    public String getBodytypeAbbreviation() {
        return bodytypeAbbreviation;
    }

    public void setBodytypeAbbreviation(String bodytypeAbbreviation) {
        this.bodytypeAbbreviation = bodytypeAbbreviation;
    }

    @Column
    private Boolean vehichlePlanAvailable_D3010;

    @Column
    private Boolean informationDisplayInternal_D3020;


    @Column
    private Boolean informationDisplayExternal_D3021;



    @Column
    private Boolean loudspeakerAutomatic_D3030;


    @Column
    private Boolean loudSpeakerManual_D3031;













    @Column
    private Boolean areaForMobilityRestrictedAvailable_D3050;


    @Column
    private String locationOfMobilityAreaForMobilityRestricted_D3051;


    @Column
    private Boolean toiletAvailable_D3060;


    @Column
    private Boolean accessibleToiletAvailable_D3061;


    @Column
    private Boolean ticketMachineAvailable_D3070;




    @Column
    private Integer minimumHeightOfFloorFromGround_D3100;


    @Column
    private Boolean canKneel;


    @Column
    private Boolean hasStairs_D3110;


    @Column
    private  Integer heightOfStairs_D3111;

    @Column
    private Integer numberOfStairs_D3112;


    @Column
    private Boolean stairsFoldable_D3113;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getVehichlePlanAvailable_D3010() {
        return vehichlePlanAvailable_D3010;
    }

    public void setVehichlePlanAvailable_D3010(Boolean vehichlePlanAvailable_D3010) {
        this.vehichlePlanAvailable_D3010 = vehichlePlanAvailable_D3010;
    }

    public Boolean getInformationDisplayInternal_D3020() {
        return informationDisplayInternal_D3020;
    }

    public void setInformationDisplayInternal_D3020(Boolean informationDisplayInternal_D3020) {
        this.informationDisplayInternal_D3020 = informationDisplayInternal_D3020;
    }

    public Boolean getInformationDisplayExternal_D3021() {
        return informationDisplayExternal_D3021;
    }

    public void setInformationDisplayExternal_D3021(Boolean informationDisplayExternal_D3021) {
        this.informationDisplayExternal_D3021 = informationDisplayExternal_D3021;
    }

    public Boolean getLoudspeakerAutomatic_D3030() {
        return loudspeakerAutomatic_D3030;
    }

    public void setLoudspeakerAutomatic_D3030(Boolean loudspeakerAutomatic_D3030) {
        this.loudspeakerAutomatic_D3030 = loudspeakerAutomatic_D3030;
    }

    public Boolean getLoudSpeakerManual_D3031() {
        return loudSpeakerManual_D3031;
    }

    public void setLoudSpeakerManual_D3031(Boolean loudSpeakerManual_D3031) {
        this.loudSpeakerManual_D3031 = loudSpeakerManual_D3031;
    }

    public Boolean getAreaForMobilityRestrictedAvailable_D3050() {
        return areaForMobilityRestrictedAvailable_D3050;
    }

    public void setAreaForMobilityRestrictedAvailable_D3050(Boolean areaForMobilityRestrictedAvailable_D3050) {
        this.areaForMobilityRestrictedAvailable_D3050 = areaForMobilityRestrictedAvailable_D3050;
    }

    public String getLocationOfMobilityAreaForMobilityRestricted_D3051() {
        return locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public void setLocationOfMobilityAreaForMobilityRestricted_D3051(String locationOfMobilityAreaForMobilityRestricted_D3051) {
        this.locationOfMobilityAreaForMobilityRestricted_D3051 = locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public Boolean getToiletAvailable_D3060() {
        return toiletAvailable_D3060;
    }

    public void setToiletAvailable_D3060(Boolean toiletAvailable_D3060) {
        this.toiletAvailable_D3060 = toiletAvailable_D3060;
    }

    public Boolean getAccessibleToiletAvailable_D3061() {
        return accessibleToiletAvailable_D3061;
    }

    public void setAccessibleToiletAvailable_D3061(Boolean accessibleToiletAvailable_D3061) {
        this.accessibleToiletAvailable_D3061 = accessibleToiletAvailable_D3061;
    }

    public Boolean getTicketMachineAvailable_D3070() {
        return ticketMachineAvailable_D3070;
    }

    public void setTicketMachineAvailable_D3070(Boolean ticketMachineAvailable_D3070) {
        this.ticketMachineAvailable_D3070 = ticketMachineAvailable_D3070;
    }

    public Integer getMinimumHeightOfFloorFromGround_D3100() {
        return minimumHeightOfFloorFromGround_D3100;
    }

    public void setMinimumHeightOfFloorFromGround_D3100(Integer minimumHeightOfFloorFromGround_D3100) {
        this.minimumHeightOfFloorFromGround_D3100 = minimumHeightOfFloorFromGround_D3100;
    }

    public Boolean getCanKneel() {
        return canKneel;
    }

    public void setCanKneel(Boolean canKneel) {
        this.canKneel = canKneel;
    }

    public Boolean getHasStairs_D3110() {
        return hasStairs_D3110;
    }

    public void setHasStairs_D3110(Boolean hasStairs_D3110) {
        this.hasStairs_D3110 = hasStairs_D3110;
    }

    public Integer getHeightOfStairs_D3111() {
        return heightOfStairs_D3111;
    }

    public void setHeightOfStairs_D3111(Integer heightOfStairs_D3111) {
        this.heightOfStairs_D3111 = heightOfStairs_D3111;
    }

    public Integer getNumberOfStairs_D3112() {
        return numberOfStairs_D3112;
    }

    public void setNumberOfStairs_D3112(Integer numberOfStairs_D3112) {
        this.numberOfStairs_D3112 = numberOfStairs_D3112;
    }

    public Boolean getStairsFoldable_D3113() {
        return stairsFoldable_D3113;
    }

    public void setStairsFoldable_D3113(Boolean stairsFoldable_D3113) {
        this.stairsFoldable_D3113 = stairsFoldable_D3113;
    }
}
