package com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.bustypes;

import com.NVBWCho.vehichleRegister.delficonform.bus.Bus;
import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("deliBus_standardLowFloor")

public class StandardLowFloorBus extends Bus {

    public StandardLowFloorBus(){

        super();
        this.setCanKneel(true);

        this.setAccessibleToiletAvailable_D3061(true);
        this.setToiletAvailable_D3060(true);
        this.setAreaForMobilityRestrictedAvailable_D3050(true);
        this.setLocationOfMobilityAreaForMobilityRestricted_D3051("NA");
        this.setInformationDisplayExternal_D3021(true);
        this.setInformationDisplayInternal_D3020(true);
        this.setLoudspeakerAutomatic_D3030(true);
        this.setLoudSpeakerManual_D3031(true);
        this.setMinimumHeightOfFloorFromGround_D3100(10);
        this.setTicketMachineAvailable_D3070(false);
        this.setVehichlePlanAvailable_D3010(true);
    }
}
