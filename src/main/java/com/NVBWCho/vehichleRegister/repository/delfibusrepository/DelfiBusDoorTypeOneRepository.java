package com.NVBWCho.vehichleRegister.repository.delfibusrepository;

import com.NVBWCho.vehichleRegister.delficonform.bus.door.Door;
import com.NVBWCho.vehichleRegister.delficonform.persistedentities.bus.StandardDoorTypeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  DelfiBusDoorTypeOneRepository extends JpaRepository<StandardDoorTypeOne,Long> {


    @Query("SELECT d FROM Door d WHERE d.bus.id = :busId")
    List<Door> findDoorsByBusId(@Param("busId") Long busId);




}
