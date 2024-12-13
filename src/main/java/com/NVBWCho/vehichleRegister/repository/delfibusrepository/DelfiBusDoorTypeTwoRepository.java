package com.NVBWCho.vehichleRegister.repository.delfibusrepository;

import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DelfiBusDoorTypeTwoRepository extends JpaRepository<StandardDoorTypeTwo,Long> {
}
