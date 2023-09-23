package howToDoBeanConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationBeanByMainMethod {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationBeanByMainMethod.class,args);
    }
}
