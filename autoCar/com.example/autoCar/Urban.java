package autoCar;

public class Urban extends Road {
	
	 public double getSpeed(double speed) {
	        double carspeed = speed - (speed * 25 / 100);
	        return carspeed;

	    }

}
