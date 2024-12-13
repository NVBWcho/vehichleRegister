package com.NVBWCho.vehichleRegister.repository.delfibusrepository.busramprepository;

import com.NVBWCho.vehichleRegister.delficonform.bus.ramp.Ramp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRampRepository extends JpaRepository<Ramp,Long> {
}
