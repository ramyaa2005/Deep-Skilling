package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    void testSignUpUserSendsWelcomeEmail() {
        // Arrange
        EmailService mockEmailService = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(mockEmailService);

        // Act
        notificationService.signUpUser("ramya@example.com");

        // Assert (verify interaction)
        verify(mockEmailService, times(1))
            .sendEmail("ramya@example.com", "Welcome to our platform!");
    }
}
