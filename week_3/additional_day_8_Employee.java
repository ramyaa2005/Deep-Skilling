package com.example.ormmapping;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Many-to-One
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {}

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department=" + department.getName() + "}";
    }
}
