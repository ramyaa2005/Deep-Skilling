package com.example;

public class OrderService {

    private PaymentGateway gateway;

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public String placeOrder(double amount) {
        boolean success = gateway.processPayment(amount);
        return success ? "Payment Successful" : "Payment Failed";
    }
}
