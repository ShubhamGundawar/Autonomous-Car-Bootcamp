package com.example.demo.service;

import java.text.DecimalFormat;

public class Road{
	//Result r=new Result();
	int refuelCount = 0;
	

	double totaldistance;
	double totaltimetaken;
	double fuelTime = 0.5;
	double fuelStationDistance = 5;
	public int getRefuelCount() {
		return refuelCount;
	}

	public void setRefuelCount(int refuelCount) {
		this.refuelCount = refuelCount;
	}

	public double getTotaldistance() {
		return totaldistance;
	}

	public void setTotaldistance(double totaldistance) {
		this.totaldistance = totaldistance;
	}

	public double getTotaltimetaken() {
		return totaltimetaken;
	}

	public void setTotaltimetaken(double totaltimetaken) {
		this.totaltimetaken = totaltimetaken;
	}
	DecimalFormat df = new DecimalFormat("###.##");
	
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

	    public int travelRoad(double roadLength, double capacity, double maxCapacity, double garageDistance)
	    {	refuelCount=0;
	        while(roadLength>0){
	            System.out.println("On City Road");
	            while(capacity>fuelStationDistance && roadLength>0){
	                roadLength--;
	                capacity--;
	            }	
	            if(capacity==fuelStationDistance){
	                capacity = refuleing(maxCapacity,fuelStationDistance);	                
	            }
	        }
	        if(capacity>=fuelStationDistance && capacity<garageDistance){
	        	capacity = refuleing(maxCapacity, fuelStationDistance);
	        }	    
	        return refuelCount;
	    }
	 
	    public double getTotalDistance(double roadlength, double garagedistance, int refuelCount) 
	    {
	         totaldistance = roadlength + 2 * fuelStationDistance * refuelCount + 2 * garagedistance;
	        totaldistance = Double.parseDouble(df.format(totaldistance));
	        return totaldistance;
	    }
	    
	    public double getTotalTime(int refuelCount,double speedLimit, double roadlength, double garagedistance,double speed) 
	    {
	         totaltimetaken = (refuelCount * fuelTime) + (roadlength / speed) + 2 * (garagedistance / speedLimit)+ 2 * (fuelStationDistance / speed) * refuelCount;	        
	        totaltimetaken = Double.parseDouble(df.format(totaltimetaken));
	        return totaltimetaken;
	    }
	    
	    public Road getOutput(double speedLimit,double roadlength,double garagedistance,double speed,double capacity, double maxCapacity)
	    {
	    	reachCityGarage(maxCapacity, garagedistance);
	    	travelRoad(roadlength, capacity, maxCapacity, garagedistance);
			reachCityGarage(capacity, garagedistance);	
			System.out.println("Total distance travelled: " + getTotalDistance(roadlength, garagedistance, refuelCount) +"km");
			System.out.println("Number of times Refuelled: " + refuelCount);
			System.out.println("Total time taken: " + getTotalTime(refuelCount, speedLimit, roadlength, garagedistance, speed) +"Hrs");
			Road r=new Road();
			r.setTotaltimetaken(totaltimetaken);
			r.setRefuelCount(refuelCount);
			r.setTotaldistance(totaldistance);
			return r;
	    }

}
