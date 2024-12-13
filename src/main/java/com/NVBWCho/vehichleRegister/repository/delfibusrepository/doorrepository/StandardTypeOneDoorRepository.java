package com.NVBWCho.vehichleRegister.repository.delfibusrepository.doorrepository;

import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardTypeOneDoorRepository extends JpaRepository<StandardDoorTypeOne,Long> {

}
