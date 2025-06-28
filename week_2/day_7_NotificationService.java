package com.example;

public class NotificationService {
    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void signUpUser(String email) {
        // some logic like saving user etc.
        emailService.sendEmail(email, "Welcome to our platform!");
    }
}

