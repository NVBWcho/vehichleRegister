package com.NVBWCho.vehichleRegister;

import com.NVBWCho.vehichleRegister.delficonform.typebased.services.BusDoorTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VehichleRegisterApplicationTests {

	@Autowired
	BusDoorTypeService busDoorTypeService;



	@Test
	void contextLoads() {
	}


	@Test
	void testDoorTypeService(){

		busDoorTypeService.createTestDoorType();
		busDoorTypeService.getExistingDoorTypes();

	}

}
