package com.example;

public class Student {
    private StudentService studentService;

    // ✅ Default constructor for Spring setter injection
    public Student() {
        System.out.println("Default constructor called");
    }

    // Constructor Injection
    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    // Setter Injection
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void displayInfo() {
        System.out.println("Student Info: " + studentService.getStudentInfo());
    }
}
