package com.example;

public class UserService {

    public boolean isEligible(String name, int age) {
        if (name == null || name.isEmpty()) return false;
        return age >= 18;
    }

    public String welcomeMessage(String name) {
        return "Welcome, " + name + "!";
    }
}
