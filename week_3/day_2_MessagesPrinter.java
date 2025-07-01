package com.example;

public class MessagePrinter {
    private String message;

    // Setter method for Spring to inject
    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message from Spring: " + message);
    }
}
