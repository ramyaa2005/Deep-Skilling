package com.example.banking_loan_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BankingLoanServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankingLoanServiceApplication.class, args);
    }

    @GetMapping("/loan")
    public String loan() {
        return "Banking Loan Service Running!";
    }
}

