package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the dependent bean
        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");

        // Use it
        printer.printMessage();
    }
}
