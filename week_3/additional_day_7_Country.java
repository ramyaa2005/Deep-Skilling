package com.example.querymethods;

import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Country() {}

    public Country(String name) {
        this.name = name;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "Country{id=" + id + ", name='" + name + "'}";
    }
}
