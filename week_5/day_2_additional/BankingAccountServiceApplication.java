package com.example.banking_account_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BankingAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingAccountServiceApplication.class, args);
    }

    @GetMapping("/account")
    public String getAccountDetails() {
        return "Account Service is running!";
    }
}

