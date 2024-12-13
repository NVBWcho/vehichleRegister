package com.NVBWCho.vehichleRegister.repository;

import com.NVBWCho.vehichleRegister.experimental.persistedentities.StandardRampTypeZero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRampTypeZeroRepository extends JpaRepository<StandardRampTypeZero,Long> {



}
