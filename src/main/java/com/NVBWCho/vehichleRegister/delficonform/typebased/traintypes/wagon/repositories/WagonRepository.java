package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonRepository extends JpaRepository<Wagon,Long> {
}
