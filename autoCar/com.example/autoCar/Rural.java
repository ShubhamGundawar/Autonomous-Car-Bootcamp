package autoCar;

public class Rural extends Road{
	
	public double getSpeed(double speed) {
        double carspeed = speed + (speed * 15 / 100);
        return carspeed;

    }

}
