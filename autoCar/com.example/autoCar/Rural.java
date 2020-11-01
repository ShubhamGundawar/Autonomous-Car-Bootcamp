package autoCar;

public class Rural extends Road{
	
	public static double getSpeed(double speed) {
        double carspeed = speed + (speed * 15 / 100);
        return carspeed;

    }

}
