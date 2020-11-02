package autoCarTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import autoCar.Road;

class roadTest {
	Road obj;
	
	@BeforeEach
	void init() {
		obj = new Road();
	}
	
	@Test
	void testCapacityForGaragerReach() {
		assertAll(() -> assertEquals(130,obj.reachCityGarage(150, 20)),
				() -> assertEquals(150, obj.reachCityGarage(200, 50)),
				() -> assertEquals(80, obj.reachCityGarage(150, 70)));
	}
	
	@Test
	void testTimeTaken() {
		assertAll(() -> assertEquals(0.57,obj.getTotalTime(0, 70, 0, 20, 52.5)),//40
				() -> assertEquals(1.43,obj.getTotalTime(0, 70, 0, 50, 80.5)),
				() -> assertEquals(18.57,obj.getTotalTime(0, 70, 900, 50, 52.5)),
				() -> assertEquals(11.75,obj.getTotalTime(0, 70, 900, 20, 80.5)),
				() -> assertEquals(21.86,obj.getTotalTime(6, 70, 900, 20, 52.5)));
	}
	
	@Test
	void testTotalDistance() {
		assertAll(() -> assertEquals(40, obj.getTotalDistance(0, 20, 0)),
				() -> assertEquals(100, obj.getTotalDistance(0, 50, 0)),
				() -> assertEquals(1000, obj.getTotalDistance(900, 20, 6)),
				() -> assertEquals(1040, obj.getTotalDistance(900, 50, 4)));
	}
	
	@Test
	void refuleCount() {
		assertAll(() -> assertEquals(6, obj.travelRoad(900, 130, 150, 20)),
				() ->assertEquals(0, obj.travelRoad(0, 130, 150, 20)));
	}
}
