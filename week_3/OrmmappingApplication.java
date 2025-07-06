package com.example.ormmapping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class OrmmappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmmappingApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(DepartmentRepository departmentRepo, EmployeeRepository employeeRepo) {
        return args -> {
            Department dept1 = new Department("ECE");
            Department dept2 = new Department("CSE");

            departmentRepo.saveAll(Arrays.asList(dept1, dept2));

            Employee emp1 = new Employee("Ramya", dept1);
            Employee emp2 = new Employee("Anjali", dept1);
            Employee emp3 = new Employee("Karthik", dept2);

            employeeRepo.saveAll(Arrays.asList(emp1, emp2, emp3));

            System.out.println("All Employees:");
            employeeRepo.findAll().forEach(System.out::println);
        };
    }
}
