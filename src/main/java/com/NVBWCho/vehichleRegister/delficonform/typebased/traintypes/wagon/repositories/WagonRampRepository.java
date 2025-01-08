package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.wagonobjects.WagonRamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonRampRepository extends JpaRepository<WagonRamp,Long> {
}
