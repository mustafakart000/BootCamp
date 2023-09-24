package springConfig.JavaBaseConfig;

public class Traveller {
    private Vehicle vehicle;

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }
}
