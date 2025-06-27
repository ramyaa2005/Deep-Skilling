package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService service;

    @BeforeEach
    void setUp() {
        service = new UserService();  // Arrange: common for all tests
        System.out.println("Setting up UserService...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up UserService...");
    }

    @Test
    void testEligibleUser() {
        // Act
        boolean result = service.isEligible("Ramya", 20);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIneligibleUserByAge() {
        boolean result = service.isEligible("Ramya", 15);
        assertFalse(result);
    }

    @Test
    void testIneligibleUserByName() {
        boolean result = service.isEligible("", 22);
        assertFalse(result);
    }

    @Test
    void testWelcomeMessage() {
        String msg = service.welcomeMessage("Ramya");
        assertEquals("Welcome, Ramya!", msg);
    }
}
