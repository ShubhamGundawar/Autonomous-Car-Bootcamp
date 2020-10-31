package com.example.test;

class Rural extends Road{
	
	public static float getRuralSpeed(float speed)
	{
		float carspeed=speed+(speed*15/100);
		return carspeed;
		
	}
	
}
