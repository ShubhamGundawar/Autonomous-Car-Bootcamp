package autoCar;

import java.util.*;

public class Car {

	public static void main(String args[]) {

		int con = 1;
		do {
			double maxCapacity = 200;
			double capacity = 200;
			double garageDistance;
			double speedLimit = 70;
			
			double speed;
			int type = 99; // 0-urban, 1-rural maxint
			

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Road Type : ");
			String roadtype = sc.nextLine();

			do { // validates that only urban or rural is entered as road type
				if (roadtype.equalsIgnoreCase("urban")) {
					type = 0;
					// System.out.println(type);
				} else if (roadtype.equalsIgnoreCase("rural")) {
					type = 1;
					// System.out.println(type);
				} else {
					System.out.println("Invalid Road Type!! Valid Road Type are Urban or Rural");
					System.out.println("Enter Road type again : ");
					roadtype = sc.nextLine();
				}
			} while (type == 99);

			System.out.println("Enter Road Length : ");
			String roadLen = sc.nextLine();
			while (!isNumeric(roadLen)) {
				System.out.println("Invalid Length!! Enter again: ");
				roadLen = sc.nextLine();
			}
			double roadLength = Double.parseDouble(roadLen);
			//Road obj = new Road();	
			
			if(type == 0) {
				Urban obj = new Urban();
				garageDistance = 20;
				maxCapacity = capacity - (capacity*25/100);
				capacity = maxCapacity;
				System.out.println("capacity "+capacity);				
				speed = obj.getSpeed(speedLimit);
				System.out.println("speed "+speed);			
				obj.getOutput(speedLimit, roadLength, garageDistance, speed, capacity, maxCapacity);
				
			}else if(type == 1) {
				Rural obj = new Rural();
				garageDistance = 50;
				capacity = maxCapacity;
				System.out.println("capacity "+capacity);				
				speed = obj.getSpeed(speedLimit);
				System.out.println("speed "+speed);			
				obj.getOutput(speedLimit, roadLength, garageDistance, speed, capacity, maxCapacity);
			}

			System.out.println("\n******************************************\n");
			System.out.println("continue?(1/0)");
			con = sc.nextInt();
		} while (con == 1);
		System.out.println("Thank You !!");
	}


	public static boolean isNumeric(String str) {
		return str.matches("^\\d+(?:\\.{1}\\d+)?$");
	}

}