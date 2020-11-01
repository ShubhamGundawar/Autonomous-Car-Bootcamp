package autoCarTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import autoCar.Road;

class roadTest {

//private MathUtils mathUtils;
	
	/*
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}
*/
	
	@Test
	void testCapacityForGaragerReach() {
		Road obj = new Road();
		assertAll(() -> assertEquals(130,obj.reachCityGarage(150, 20)),
				() -> assertEquals(150, obj.reachCityGarage(200, 50)),
				() -> assertEquals(80, obj.reachCityGarage(150, 70)));
	}

}
