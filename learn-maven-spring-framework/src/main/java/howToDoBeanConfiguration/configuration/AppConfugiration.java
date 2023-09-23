package howToDoBeanConfiguration.configuration;

import howToDoBeanConfiguration.CarVehicleService;
import howToDoBeanConfiguration.PlaneVehicleService;
import howToDoBeanConfiguration.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfugiration {

    @Bean
    public VehicleService carVehicleServiceConfiguration(){
        return new CarVehicleService();
    }
    @Bean
    public VehicleService planeVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }
}
