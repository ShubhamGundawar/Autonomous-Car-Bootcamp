package autoCarTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import autoCar.Road;
import autoCar.Rural;

class ruralTest {

	@Test
	void test() {
		Rural obj = new Rural();
		assertAll(() -> assertEquals(80.5,obj.getSpeed(70)),
				() -> assertEquals(0, obj.getSpeed(0)),
				() -> assertEquals(0, obj.getSpeed(0.0)));
	}

}
