package howToDoBeanConfiguration.configuration;

import howToDoBeanConfiguration.CarVehicleService;
import howToDoBeanConfiguration.PlaneVehicleService;
import howToDoBeanConfiguration.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppConfugiration {

    @Bean
    @Primary
    public VehicleService carVehicleServiceConfiguration(){
        return new CarVehicleService();
    }
    @Bean
    public VehicleService planeVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }
}
