package com.example;

public class MessagePrinter {
    private TextService textService;

    // Setter for Dependency Injection
    public void setTextService(TextService textService) {
        this.textService = textService;
    }

    public void printMessage() {
        System.out.println(textService.getMessage());
    }
}
