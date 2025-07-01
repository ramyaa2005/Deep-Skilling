package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();
    }
}
