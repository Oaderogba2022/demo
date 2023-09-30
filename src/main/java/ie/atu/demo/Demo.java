package ie.atu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";

    }


}
