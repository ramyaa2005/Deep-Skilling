package com.example.querymethods;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findByName(String name);

    List<Country> findByNameContaining(String keyword);

    List<Country> findByNameStartingWith(String prefix);
}

