package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;




import com.example.demo.service.Road;
import com.example.demo.service.Urban;


class urbanTest {

	@Test
	void testSpeed() {
		Urban obj = new Urban();
		assertAll(() -> assertEquals(52.5,obj.getSpeed(70)),
				() -> assertEquals(0, obj.getSpeed(0)),
				() -> assertEquals(0, obj.getSpeed(0.0)));
	}

}