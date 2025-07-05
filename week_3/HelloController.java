 
package com.example.hibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "✅ Hello Ramya! Your Spring Boot project is working!";
    }
}


