package com.example.hql_native_query;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;

    public Student() {}

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}
