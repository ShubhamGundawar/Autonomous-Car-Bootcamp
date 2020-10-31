package com.example.test;

import java.util.*;
import java.text.DecimalFormat;

public class Car {
	
		
		static final float timetofuel=(float) 0.5;
		
		public static void main(String args[])
		{
			 
			 int con=1;
			 String str1="urban";
			 String str2="rural";
			do {
				 int refuel=0;
			   	 float capacity=200;
				 float  garagedistance=20;
				 float ruralgaragedistance=50;
				 float speed=70;
				 float fuelstationdistance=5; 
				 
			System.out.println("Enter road type and road length");
			
			Scanner sc = new Scanner(System.in);
			String roadtype=sc.nextLine();
			float roadlength=sc.nextFloat();
						
			float roadlength1=roadlength;
			 
			 if(roadtype.equalsIgnoreCase(str1))
			 {
			 
			  Urban r2=new Urban();
			 
			 
			 
			 
			 //capacity=capacity-(capacity*25/100);
			 //System.out.print(capacity);
			 
			 capacity=r2.getUrbanCapacity(capacity);
			 System.out.println("capacity "+capacity);
			 
			 float speed1=r2.getUrbanSpeed(speed);
			 System.out.println("speed "+speed1);
			 
			 System.out.println("Car has travelled from garage to urban road");
			 float carcantravel=r2.getCarCanTravelDistance(capacity,garagedistance,fuelstationdistance);
			 
			 while (roadlength>carcantravel)
			 {
			 System.out.println("Now car can travel "+carcantravel+" km before refuelling");	 
			 roadlength=r2.getCarNeedsToCover(roadlength,carcantravel);
			 
			 System.out.println("Car needs to cover "+roadlength+" km");
			 carcantravel=r2.getCarCapacityAfterRefuelling(capacity,fuelstationdistance);
			 refuel++;
				 if(roadlength<carcantravel)
				 {
					float carneedstotravel=r2.getDistanceToGarage(roadlength,garagedistance);
					System.out.println(carneedstotravel+" (including distance to garage)");
				 }
			 }
			 
			 
			
				
				System.out.println("\n******************************************\n");
			 
			 float totaltime=r2.getTotalTime(refuel,timetofuel,speed,roadlength1,garagedistance,speed1,fuelstationdistance);
				 	
			 System.out.println("No of times refuelled: "+refuel);
			 		
			 float totaldistancetravelled=r2.getTotalDistanceTravelled(refuel,roadlength1,fuelstationdistance,garagedistance);
				 	System.out.println("Total distance travelled: "+totaldistancetravelled+" km");
				 	
			  
			}
			 else if(roadtype.equalsIgnoreCase(str2))
			 {
				 Rural r3=new Rural();
				 System.out.println("capacity "+capacity);
				 float speed1=r3.getRuralSpeed(speed);
				 System.out.println("speed "+speed1);
				 System.out.println("Car has travelled from garage to urban road");
				 float carcantravel=r3.getCarCanTravelDistance(capacity,ruralgaragedistance,fuelstationdistance);
				 while (roadlength>carcantravel)
				 {
				 System.out.println("Now car can travel "+carcantravel+" km before refuelling");	 
				 roadlength=r3.getCarNeedsToCover(roadlength,carcantravel);
				 
				 System.out.println("Car needs to cover "+roadlength+" km");
				 carcantravel=r3.getCarCapacityAfterRefuelling(capacity,fuelstationdistance);
				 refuel++;
				 
					 if(roadlength<carcantravel)
					 {
						float carneedstotravel=r3.getDistanceToGarage(roadlength,ruralgaragedistance);
						System.out.println(carneedstotravel+" (including distance to garage)");
					 }
				 }
				 
				 
				
					
					System.out.println("\n******************************************\n");
				 
				 float totaltime=r3.getTotalTime(refuel,timetofuel,speed,roadlength1,ruralgaragedistance,speed1,fuelstationdistance);
					 	
				 System.out.println("No of times refuelled: "+refuel);
				 		
				 float totaldistancetravelled=r3.getTotalDistanceTravelled(refuel,roadlength1,fuelstationdistance,ruralgaragedistance);
					 	System.out.println("Total distance travelled: "+totaldistancetravelled+" km");
					 	
				 		 
			 }
			 

			 System.out.println("\n******************************************\n");
			 System.out.println("continue?(1/0)");
			 con=sc.nextInt();
			 }while(con==1);
			 
			
		}
}