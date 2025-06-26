package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testIsEmpty_withNull() {
        assertTrue(utils.isEmpty(null));
    }

    @Test
    void testIsEmpty_withSpaces() {
        assertTrue(utils.isEmpty("   "));
    }

    @Test
    void testIsEmpty_withText() {
        assertFalse(utils.isEmpty("Ramya"));
    }

    @Test
    void testReverse() {
        assertEquals("aymaR", utils.reverse("Ramya"));
    }

    @Test
    void testToUpper() {
        assertEquals("RAMYA", utils.toUpper("Ramya"));
    }

    @Test
    void testToUpper_withNull() {
        assertNull(utils.toUpper(null));
    }
    @Test
void hello() {
    System.out.println("✅ Hello JUnit from Ramya!");
    assertEquals(1, 1);
}
}

