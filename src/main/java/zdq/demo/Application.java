package zdq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {
    @RequestMapping("/")
    String home() {
        System.out.println("hello world 33333333333");
        return "Hello World!33333";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}