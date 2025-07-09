package com.example.countryrest.service;

import com.example.countryrest.model.Country;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryService {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India", "New Delhi"));
        countryMap.put("US", new Country("US", "United States", "Washington D.C."));
        countryMap.put("FR", new Country("FR", "France", "Paris"));
        countryMap.put("JP", new Country("JP", "Japan", "Tokyo"));
    }

    public List<Country> getAllCountries() {
        return new ArrayList<>(countryMap.values());
    }

    public Country getCountryByCode(String code) {
        return countryMap.get(code.toUpperCase());
    }
}
