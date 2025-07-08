package com.example.rest.spring_rest_handson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Spring Boot 3 REST!";
    }
}
