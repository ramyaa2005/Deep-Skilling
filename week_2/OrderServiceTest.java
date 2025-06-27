package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void testSuccessfulPayment() {
        PaymentGateway mockGateway = mock(PaymentGateway.class);
        when(mockGateway.processPayment(500.0)).thenReturn(true);

        OrderService service = new OrderService(mockGateway);

        String result = service.placeOrder(500.0);
        assertEquals("Payment Successful", result);
    }

    @Test
    void testFailedPayment() {
        PaymentGateway mockGateway = mock(PaymentGateway.class);
        when(mockGateway.processPayment(1000.0)).thenReturn(false);

        OrderService service = new OrderService(mockGateway);

        String result = service.placeOrder(1000.0);
        assertEquals("Payment Failed", result);
    }
}
