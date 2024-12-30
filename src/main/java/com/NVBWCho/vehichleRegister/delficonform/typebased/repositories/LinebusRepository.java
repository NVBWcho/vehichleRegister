package com.NVBWCho.vehichleRegister.delficonform.typebased.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.Linebus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinebusRepository extends JpaRepository<Linebus,Long> {
}
