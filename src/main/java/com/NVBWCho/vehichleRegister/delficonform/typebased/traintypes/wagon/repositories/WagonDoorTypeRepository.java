package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.doortypes.WagonDoorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonDoorTypeRepository extends JpaRepository<WagonDoorType,Long> {
}
