package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        // Load the Spring container from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get Student bean via Setter Injection
        Student setterInjectedStudent = (Student) context.getBean("studentSetter");
        System.out.println("Using Setter Injection:");
        setterInjectedStudent.displayInfo();

        // Get Student bean via Constructor Injection
        Student constructorInjectedStudent = (Student) context.getBean("studentConstructor");
        System.out.println("\nUsing Constructor Injection:");
        constructorInjectedStudent.displayInfo();
    }
}
