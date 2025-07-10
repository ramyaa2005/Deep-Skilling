package com.example.getcountry.controller;
import com.example.getcountry.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("UK", "United Kingdom"));
        countryList.add(new Country("JP", "Japan"));
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }
        throw new NoSuchElementException("Country not found for code: " + code);
    }
}
