package autoCar;

import java.text.DecimalFormat;

public class Road{
	
	int refuelCount = 0;
	double fuelTime = 0.5;
	double fuelStationDistance = 5;
	
	public double refuleing(double capacity,double fuelStationDistance) {
	    refuelCount++;    
		capacity=capacity-fuelStationDistance;
	        System.out.println("Refuled");
	        return capacity;
	}
	
	public double reachCityGarage(double capacity, double garageDistance) {
	        capacity= capacity - garageDistance;
	        System.out.println("Reached");
	        return capacity;
	    }

	    public double travelRoad(double roadLength, double capacity, double fuelStationDistance, double maxCapacity, double garageDistance)
	    {
	        while(roadLength>0){
	            System.out.println("On City Road");
	            while(capacity>fuelStationDistance && roadLength>0){
	                roadLength--;
	                capacity--;
	            }
	            /*dist = capacity - fuelStationDistance;
	            roadLength = roadLength -dist;
	            capacity = capacity - dist;  */		
	            if(capacity==fuelStationDistance){
	                capacity = refuleing(maxCapacity, fuelStationDistance);	                
	            }
	        }
	        if(capacity>=fuelStationDistance && capacity<garageDistance){
	        	capacity = refuleing(maxCapacity, fuelStationDistance);
	        }	    
	        
	        return capacity;
	    }
	 
	    public void getTotalDistance(double roadlength, double fuelstationdistance, double garagedistance, int refuelCount) 
	    {
	        double totaldistance = roadlength + 2 * fuelstationdistance * refuelCount + 2 * garagedistance;
	        System.out.println("Total distance travelled "+totaldistance+" km");
	        
	    }
	    
	    public void getTotalTime(int refuelCount,double speedLimit, double roadlength, double garagedistance,double speed) 
	    {
	        double totaltimetaken = (refuelCount * fuelTime) + (roadlength / speed) + 2 * (garagedistance / speedLimit)+ 2 * (fuelStationDistance / speed) * refuelCount;
	        DecimalFormat df = new DecimalFormat("###.##");
	        System.out.println("Total time taken: " + df.format(totaltimetaken) + " hrs");
	    }
	    
	public void getOutput(double speedLimit,double roadlength,double garagedistance,double speed,double capacity, double maxCapacity)
	{
		reachCityGarage(maxCapacity, garagedistance);
		travelRoad(roadlength, capacity, fuelStationDistance, maxCapacity, garagedistance);
		reachCityGarage(capacity, garagedistance);	
		getTotalDistance(roadlength, fuelStationDistance, garagedistance, refuelCount);
		System.out.println("Number of times Refuelled:" + refuelCount);
		getTotalTime(refuelCount, speedLimit, roadlength, garagedistance, speed);
	}

	
	/*public double getSpeed(int type, double speedLimit) //calculate changed speed 
	{
		double speed=0;
		if(type == 0) {
			speed=speedLimit - (speedLimit*25/100);
			return speed;
		}
		else {
			speed=speedLimit + (speedLimit*15/100);
			return speed;
		}		
	}*/
	

}