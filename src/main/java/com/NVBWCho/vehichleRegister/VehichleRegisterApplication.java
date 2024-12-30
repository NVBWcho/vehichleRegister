package com.NVBWCho.vehichleRegister;

import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.Linebus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.bodytypes.BodyType;
import com.NVBWCho.vehichleRegister.delficonform.typebased.services.BodyTypeService;
import com.NVBWCho.vehichleRegister.delficonform.typebased.services.BusDoorTypeService;
import com.NVBWCho.vehichleRegister.delficonform.typebased.services.LinebusService;
import com.NVBWCho.vehichleRegister.delficonform.typebased.services.RampTypeService;
import com.NVBWCho.vehichleRegister.services.experimental.RampService;
import com.NVBWCho.vehichleRegister.services.delfiservices.BusService;
import com.NVBWCho.vehichleRegister.services.delfiservices.DelfiBusDoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehichleRegisterApplication implements CommandLineRunner {

	@Autowired
	private RampService rampService;

	@Autowired

	private BodyTypeService bodyTypeService;

	@Autowired
	private LinebusService linebusService;


	@Autowired
	private RampTypeService rampTypeService;


	@Autowired

	private BusDoorTypeService busDoorTypeService;






	@Autowired
	private DelfiBusDoorService delfiBusDoorService;


	@Autowired
	private BusService busService;

	public static void main(String[] args) {
		SpringApplication.run(VehichleRegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*ExampleRampOne exampleRampOne=new ExampleRampOne("R1");

		ExampleDoorOne exampleDoorOne=new ExampleDoorOne("D1",Optional.of(exampleRampOne),10);

		ExampleDoorOne exampleDoorOneDoorTwo=new ExampleDoorOne("D2",Optional.empty(),20);


		ArrayList<BusDoor> allDoors=new ArrayList<>();
		allDoors.add(exampleDoorOne);
		allDoors.add(exampleDoorOneDoorTwo);

		ExampleBusOne exampleBusOne=new ExampleBusOne("bus1",allDoors);



		System.out.println("The bus has  "+exampleBusOne.getBusDoors().size()+" doors");*/

		//rampService.createTestRamp();

		//delfiBusDoorService.createTestDoors();

		rampTypeService.createTestRampType();



		busService.createTesBus();



		//Optional<Bus> bus=busService.getBusById(1L);

		//delfiBusDoorService.getTypeOneDoorsByBusId(1L);

		bodyTypeService.createTestBusBody();

		BodyType bodyType=bodyTypeService.getBodyTypeByBodyId(1L);

		busDoorTypeService.createTestDoorType();



		System.out.println(bodyType);

		linebusService.createTestBus();

		Linebus linebus= linebusService.getLineBusById(1L);

		System.out.println(linebus);




		busDoorTypeService.getExistingDoorTypes();





	}
}
