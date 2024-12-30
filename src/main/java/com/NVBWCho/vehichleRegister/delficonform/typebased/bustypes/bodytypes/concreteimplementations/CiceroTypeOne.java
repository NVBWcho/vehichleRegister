package com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.concreteimplementations;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("cicero_type_one")
public class CiceroTypeOne extends BodyType {

    public CiceroTypeOne (){

        super();
        this.setCanKneel(true);
        this.setBodytypeAbbreviation("cicero_type_one");

        this.setAccessibleToiletAvailable_D3061(true);
        this.setToiletAvailable_D3060(true);
        this.setAreaForMobilityRestrictedAvailable_D3050(true);
        this.setLocationOfMobilityAreaForMobilityRestricted_D3051("NA");
        this.setInformationDisplayExternal_D3021(true);
        this.setInformationDisplayInternal_D3020(true);
        this.setLoudspeakerAutomatic_D3030(true);
        this.setLoudSpeakerManual_D3031(true);
        this.setMinimumHeightOfFloorFromGround_D3100(5);
        this.setTicketMachineAvailable_D3070(false);
        this.setVehichlePlanAvailable_D3010(true);
    }


}
