package com.NVBWCho.vehichleRegister.delficonform.typebased.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.ramptypes.RampType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRampTypeRepository extends  JpaRepository<RampType,Long>  {
}
