package nyc.tafadzwa.cloudconfigservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("status")
public class CheckStatusWebClient {

    @GetMapping("/check")
    public String status() {
        return "working";
    }
}
