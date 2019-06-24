package nyc.tafadzwa.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient1Application.class, args);
    }

}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:this is the default: client is working}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
