package com.example.demo.service;

import java.util.*;
import java.text.DecimalFormat;

/*public class Car {

	static final float timetofuel = (float) 0.5;

	public static Result compute(String roadtype, float roadlength) {

		Result r = new Result();
		// int con=1;
		String str1 = "urban";
		String str2 = "rural";

		int refuel = 0;
		float capacity = 200;
		float garageDistance = 20;
		float ruralGarageDistance = 50;
		float speed = 70;
		float fuelStationDistance = 5;
		System.out.println("Enter road type and road length");
		// Scanner sc=new Scanner(System.in);
		// String roadtype=sc.nextLine();
		// float roadlength=sc.nextFloat();
		// System.out.println(roadlength);
		float roadlength1 = roadlength;
		// float totaltime=0;
		if (roadtype.equalsIgnoreCase(str1)) {

			Urban r2 = new Urban();

			// capacity=capacity-(capacity*25/100);
			// System.out.print(capacity);

			capacity = r2.getUrbanCapacity(capacity);
			System.out.println("capacity " + capacity);
			float speed1 = r2.getUrbanSpeed(speed);
			System.out.println("speed " + speed1);
			System.out.println("Car has travelled from garage to urban road");
			float carcantravel = r2.getCarCanTravelDistance(capacity, garageDistance, fuelStationDistance);
			while (roadlength > carcantravel) {
				System.out.println("Now car can travel " + carcantravel + " km before refuelling");
				roadlength = r2.getCarNeedsToCover(roadlength, carcantravel);

				System.out.println("Car needs to cover " + roadlength + " km");
				carcantravel = r2.getCarCapacityAfterRefuelling(capacity, fuelStationDistance);
				refuel++;
				// System.out.println("No of times refuel "+refuel);
				// System.out.println("Car is refuelled.It can cover distance of
				// "+carcantravel+" km");'
				if (roadlength < carcantravel) {
					float carneedstotravel = r2.getDistanceToGarage(roadlength, garageDistance);
					System.out.println(carneedstotravel + " (including distance to garage)");
				}
			}

			System.out.println("\n******************************************\n");

			float totaltime = r2.getTotalTime(r, refuel, timetofuel, speed, roadlength1, garageDistance, speed1,
					fuelStationDistance);
			r.setRefuel2(refuel);
			System.out.println("No of times refuelled: " + refuel);

			float totaldistancetravelled = r2.getTotalDistanceTravelled(r, refuel, roadlength1, fuelStationDistance,
					garageDistance);
			System.out.println("Total distance travelled: " + totaldistancetravelled + " km");

		} else if (roadtype.equalsIgnoreCase(str2)) {
			Rural r3 = new Rural();
			System.out.println("capacity " + capacity);
			float speed1 = r3.getRuralSpeed(speed);
			System.out.println("speed " + speed1);
			System.out.println("Car has travelled from garage to urban road");
			float carcantravel = r3.getCarCanTravelDistance(capacity, ruralGarageDistance, fuelStationDistance);
			while (roadlength > carcantravel) {
				System.out.println("Now car can travel " + carcantravel + " km before refuelling");
				roadlength = r3.getCarNeedsToCover(roadlength, carcantravel);

				System.out.println("Car needs to cover " + roadlength + " km");
				carcantravel = r3.getCarCapacityAfterRefuelling(capacity, fuelStationDistance);
				refuel++;
				// System.out.println("No of times refuel "+refuel);
				// System.out.println("Car is refuelled.It can cover distance of
				// "+carcantravel+" km");'
				if (roadlength < carcantravel) {
					float carneedstotravel = r3.getDistanceToGarage(roadlength, ruralGarageDistance);
					System.out.println(carneedstotravel + " (including distance to garage)");
				}
			}

			System.out.println("\n******************************************\n");

			float totaltime = r3.getTotalTime(r, refuel, timetofuel, speed, roadlength1, ruralGarageDistance, speed1,
					fuelStationDistance);
			r.setRefuel2(refuel);
			System.out.println("No of times refuelled: " + refuel);

			float totaldistancetravelled = r3.getTotalDistanceTravelled(r, refuel, roadlength1, fuelStationDistance,
					ruralGarageDistance);
			System.out.println("Total distance travelled: " + totaldistancetravelled + " km");

		}

		System.out.println("\n******************************************\n");

		return r;

	}
	
}

class Road {

	/**
	 * @param capacity
	 * @param garagedistance
	 * @param fuelstationdistance
	 * @return
	 */
	/*public static float getCarCanTravelDistance(float capacity, float garagedistance, float fuelstationdistance) {
		capacity = capacity - garagedistance - fuelstationdistance;
		return capacity;

	}

	public static float getCarNeedsToCover(float roadlength, float capacity) {
		roadlength = roadlength - capacity;
		return roadlength;
	}

	public static float getCarCapacityAfterRefuelling(float capacity, float fuelstationdistance) {
		capacity = capacity - 2 * fuelstationdistance;
		return capacity;
	}

	public static float getDistanceToGarage(float carcantravel, float garagedistance) {
		carcantravel = carcantravel + garagedistance;
		return carcantravel;
	}

	public static float getTotalDistanceTravelled(Result r, int refuel, float roadlength, float fuelstationdistance,
			float garagedistance) {
		float totaldistance = roadlength + 2 * fuelstationdistance * refuel + 2 * garagedistance;
		r.setTotaldistancetravelled(totaldistance);
		// System.out.println("Total distance travelled "+totaldistance+" km");
		return totaldistance;
	}

	public static float getTotalTime(Result r, int refuel, float timetofuel, float speed, float roadlength1,
			float garagedistance, float speed1, float fuelstationdistance) {
		float totaltimetaken = (refuel * timetofuel) + (roadlength1 / speed1) + 2 * (garagedistance / speed)
				+ 2 * (fuelstationdistance / speed1) * refuel;
		DecimalFormat df = new DecimalFormat("###.##");
		// System.out.println("Rounded double (DecimalFormat) : " + df.format(d));
		// System.out.print(speed+" "+speed1);
		System.out.println("Total time taken: " + df.format(totaltimetaken) + " hrs");
		totaltimetaken=Float.parseFloat(df.format(totaltimetaken));
		r.setTotaltime2(totaltimetaken);
		return totaltimetaken;

	}

}

class Urban extends Road {
	public static float getUrbanCapacity(float capacity) {
		float carcap = capacity - (capacity * 25 / 100);
		return carcap;
	}

	public static float getUrbanSpeed(float speed) {
		float carspeed = speed - (speed * 25 / 100);
		return carspeed;

	}

}

class Rural extends Road {

	public static float getRuralSpeed(float speed) {
		float carspeed = speed + (speed * 15 / 100);
		return carspeed;

	}

}*/


/* *************************************************************************************************************************   */


public class Car {
	public static Road compute(String roadtype,double roadLength) {

			int con = 1;
		
			double maxCapacity = 200;
			double capacity = 200;
			double garageDistance;
			double speedLimit = 70;
			double speed;
			
			Road r2=new Road();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Road Type : ");
			//String roadtype = sc.nextLine();
			/*while(!roadtype.equalsIgnoreCase("urban") && !roadtype.equalsIgnoreCase("rural"))
			{
				System.out.println("Invalid Road Type!! Valid Road Type are Urban or Rural");
				System.out.println("Enter Road type again : ");
				roadtype = sc.nextLine();
			}*/
			
			System.out.println("Enter Road Length : ");
			/*String roadLen = sc.nextLine();
			while (!isNumeric(roadLen)) {
				System.out.println("Invalid Length!! Enter again: ");
				roadLen = sc.nextLine();
			}
			 roadLength = Double.parseDouble(roadLen);*/
			
			if(roadtype.equalsIgnoreCase("urban")) {
				Urban obj = new Urban();
				garageDistance = 20;
				maxCapacity = capacity - (capacity*25/100);
				capacity = maxCapacity;
				System.out.println("capacity "+capacity);				
				speed = obj.getSpeed(speedLimit);
				System.out.println("speed "+speed);			
			 r2=obj.getOutput(speedLimit, roadLength, garageDistance, speed, capacity, maxCapacity);
			
				
			}else if(roadtype.equalsIgnoreCase("rural")) {
				Rural obj = new Rural();
				garageDistance = 50;
				capacity = maxCapacity;
				System.out.println("capacity "+capacity);				
				speed = obj.getSpeed(speedLimit);
				System.out.println("speed "+speed);			
				 r2= obj.getOutput(speedLimit, roadLength, garageDistance, speed, capacity, maxCapacity);
				 
				 
			}
			
			System.out.println("\n******************************************\n");
			
		System.out.println("Thank You !!");
		
		return r2;
		
	}


	public static boolean isNumeric(String str) {
		return str.matches("^\\d+(?:\\.{1}\\d+)?$");
	}

}















