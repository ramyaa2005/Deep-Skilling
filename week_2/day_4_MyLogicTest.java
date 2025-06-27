package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyLogicTest {

    MyLogic logic = new MyLogic();

    @Test
    void testPalindromeTrue() {
        assertTrue(logic.isPalindrome("Madam")); 
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(logic.isPalindrome("Hello"));
    }

    @Test
    void testStringLength() {
        assertEquals(5, logic.getLength("Ramya"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", logic.makeUpper("hello"));
    }

    @Test
    void testUpperCaseNotNull() {
        assertNotNull(logic.makeUpper("java")); 
    }
}
