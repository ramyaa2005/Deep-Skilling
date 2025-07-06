package com.example.countryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryserviceApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(CountryserviceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Insert sample countries
        countryRepository.save(new Country("India"));
        countryRepository.save(new Country("USA"));
        countryRepository.save(new Country("Germany"));
    }
}

