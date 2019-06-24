package nyc.tafadzwa.eurekaservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApplication.class, args);
    }

}
