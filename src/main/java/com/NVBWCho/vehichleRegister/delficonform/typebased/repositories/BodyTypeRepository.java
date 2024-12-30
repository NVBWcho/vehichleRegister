package com.NVBWCho.vehichleRegister.delficonform.typebased.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BodyTypeRepository extends JpaRepository<BodyType,Long> {
}
