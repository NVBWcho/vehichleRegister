package com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.traintypes.wagon.bodytypes.WagonBodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonBodyTypeRepository extends JpaRepository<WagonBodyType,Long> {
}
