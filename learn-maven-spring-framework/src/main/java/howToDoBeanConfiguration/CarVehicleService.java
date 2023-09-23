package howToDoBeanConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarVehicleService implements VehicleService{

    private Logger log= LoggerFactory.getLogger(CarVehicleService.class);

    @Override
    public void startEngine() {
        log.info("Starting car Engine...");

    }

    @Override
    public void stopEngine() {
        log.info("Drawing away...");
    }

    @Override
    public void move() {
        log.info("Stopping and turning Engine...");
    }
}
