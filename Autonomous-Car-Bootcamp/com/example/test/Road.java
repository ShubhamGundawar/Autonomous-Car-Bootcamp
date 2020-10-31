package com.example.test;

import java.util.*;
import java.text.DecimalFormat;

class Road{
	
	
	public static float getCarCanTravelDistance(float capacity,float garagedistance,float fuelstationdistance)
	{
		capacity=capacity-garagedistance-fuelstationdistance;
		return capacity;
		
	}
	public static float getCarNeedsToCover(float roadlength,float capacity)
	{
		roadlength=roadlength-capacity;
		return roadlength;
	}
	public static float getCarCapacityAfterRefuelling(float capacity,float fuelstationdistance)
	{
		capacity=capacity-2*fuelstationdistance;
		return capacity;
	}
	public static float getDistanceToGarage(float carcantravel,float garagedistance)
	{
		carcantravel=carcantravel+garagedistance;
		return carcantravel;
	}
	public static float getTotalDistanceTravelled(int refuel,float roadlength,float fuelstationdistance,float garagedistance)
	{
		float totaldistance=roadlength+2*fuelstationdistance*refuel+2*garagedistance;

		return totaldistance;
	}
	public static float getTotalTime(int refuel,float timetofuel,float speed,float roadlength1,float garagedistance,float speed1,float fuelstationdistance)
	{
		float totaltimetaken=(refuel*timetofuel)+(roadlength1/speed1)+2*(garagedistance/speed)+2*(fuelstationdistance/speed1)*refuel;
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("Total time taken: "+df.format(totaltimetaken)+" hrs");
		return totaltimetaken;
		
		
	}

}