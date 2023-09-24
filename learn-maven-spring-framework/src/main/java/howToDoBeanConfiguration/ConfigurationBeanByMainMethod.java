package howToDoBeanConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigurationBeanByMainMethod {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigurationBeanByMainMethod.class,args);
        VehicleService vehicleService  = context.getBean(VehicleService.class);
        VehicleService vehicleService1 = context.getBean(CarVehicleService.class);

        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
        vehicleService1.startEngine();

    }
}
