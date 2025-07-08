package com.example.rest.rest_country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country-config.xml");
        Country country = (Country) context.getBean("country");
        System.out.println(country);
    }
}

