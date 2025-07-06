package com.example.ormmapping;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // Optional: Getter for ID and employees if needed
    public Long getId() {
        return id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
}
