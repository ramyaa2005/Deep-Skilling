package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        logger.info("Bank account created for {}", accountHolder);
    }

    public void withdraw(double amount) {
        logger.info("Attempting to withdraw ${} from {}", amount, accountHolder);

        if (amount > balance) {
            logger.error("Insufficient balance! Tried to withdraw ${}, but only ${} available.", amount, balance);
            return;
        }

        balance -= amount;

        if (balance < 100) {
            logger.warn("Low balance warning for {}: Current balance is ${}", accountHolder, balance);
        } else {
            logger.info("Withdrawal successful. Remaining balance: ${}", balance);
        }
    }
}
