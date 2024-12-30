package com.NVBWCho.vehichleRegister.delficonform.typebased.repositories;

import com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects.BusDoor;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.BusDoorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;

@Repository
public interface BusDoorRepository extends JpaRepository<BusDoor, Long> {

}
