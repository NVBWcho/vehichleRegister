package com.NVBWCho.vehichleRegister.repository.delfibusrepository.bustyperepository;

import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.bustypes.StandardLowFloorBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StandardLowFloorBusRepository extends JpaRepository<StandardLowFloorBus,Long> {
}
