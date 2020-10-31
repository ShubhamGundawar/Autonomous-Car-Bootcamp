package com.example.test;

class Urban extends Road{
	public  static float getUrbanCapacity(float capacity)
	{
		float carcap=capacity-(capacity*25/100);
		return carcap;
	}
	public static float getUrbanSpeed(float speed)
	{
		float carspeed=speed-(speed*25/100);
		return carspeed;
		
	}
	
}