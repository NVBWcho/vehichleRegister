package com.NVBWCho.vehichleRegister.repository.delfibusrepository.doorrepository;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoorRepository extends JpaRepository<Door,Long> {


}
