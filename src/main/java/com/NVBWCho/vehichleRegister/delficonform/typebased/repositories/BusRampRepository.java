package com.NVBWCho.vehichleRegister.delficonform.typebased.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusRamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusRampRepository extends JpaRepository<BusRamp,Long> {
}
