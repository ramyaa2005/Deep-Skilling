package com.example;

public class StringUtils {

    public boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public String toUpper(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
