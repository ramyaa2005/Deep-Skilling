package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) {
        return repository.findByCode(code);
    }
}
