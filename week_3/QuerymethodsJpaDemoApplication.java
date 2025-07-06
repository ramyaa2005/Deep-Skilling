package com.example.querymethods;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuerymethodsJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuerymethodsJpaDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryRepository repository) {
        return args -> {
            repository.save(new Country("India"));
            repository.save(new Country("Indonesia"));
            repository.save(new Country("Ireland"));
            repository.save(new Country("Iceland"));
            repository.save(new Country("Italy"));

            System.out.println("Exact name: " + repository.findByName("India"));
            System.out.println("Contains 'land': " + repository.findByNameContaining("land"));
            System.out.println("Starts with 'I': " + repository.findByNameStartingWith("I"));
        };
    }
}

