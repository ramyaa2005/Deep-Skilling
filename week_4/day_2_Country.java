package com.example.rest.rest_country;
public class Country {
    private String name;
    private String code;

    public Country() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', code='" + code + "'}";
    }
}
