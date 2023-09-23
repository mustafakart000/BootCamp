package howToDoBeanConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneVehicleService implements VehicleService{

    private Logger log= LoggerFactory.getLogger(CarVehicleService.class);
    @Override
    public void startEngine() {
        log.info("Starting Plane Engine...");
    }

    @Override
    public void stopEngine() {
        log.info("Flying away...");
    }

    @Override
    public void move() {
        log.info("Landing and turning off plane engine...");
    }
}
