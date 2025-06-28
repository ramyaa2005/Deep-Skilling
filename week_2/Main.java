package com.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ramya", 150.0);
        account.withdraw(30);   // Info
        account.withdraw(50);   // Warn
        account.withdraw(100);  // Error
    }
}
