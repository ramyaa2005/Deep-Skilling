package com.example;

public class MyLogic {

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public int getLength(String input) {
        if (input == null) return 0;
        return input.length();
    }

    public String makeUpper(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }
}
