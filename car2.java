import java.util.*;
import java.text.DecimalFormat;
public class car2 {
	
		
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
			Scanner sc=new Scanner(System.in);
			String roadtype=sc.nextLine();
			float roadlength=sc.nextFloat();
						//System.out.println(roadlength);
			float roadlength1=roadlength;
			 //float totaltime=0;
			 if(roadtype.equalsIgnoreCase(str1))
			 {
			 
			  urban r2=new urban();
			 
			 
			 
			 
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
			 //System.out.println("No of times refuel "+refuel);
			 //System.out.println("Car is refuelled.It can cover distance of "+carcantravel+" km");'
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
				 rural r3=new rural();
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
				 //System.out.println("No of times refuel "+refuel);
				 //System.out.println("Car is refuelled.It can cover distance of "+carcantravel+" km");'
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
 class road2{
		
		
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
			//System.out.println("Total distance travelled "+totaldistance+" km");
			return totaldistance;
		}
		public static float getTotalTime(int refuel,float timetofuel,float speed,float roadlength1,float garagedistance,float speed1,float fuelstationdistance)
		{
			float totaltimetaken=(refuel*timetofuel)+(roadlength1/speed1)+2*(garagedistance/speed)+2*(fuelstationdistance/speed1)*refuel;
			DecimalFormat df = new DecimalFormat("###.##");
			//System.out.println("Rounded double (DecimalFormat) : " + df.format(d));
			//System.out.print(speed+" "+speed1);
			System.out.println("Total time taken: "+df.format(totaltimetaken)+" hrs");
			return totaltimetaken;
			
			
		}

	}
class urban extends road2{
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
class rural extends road2{
	
	public static float getRuralSpeed(float speed)
	{
		float carspeed=speed+(speed*15/100);
		return carspeed;
		
	}
	
}





