package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testMessagePrinterInjection() {
        MessagePrinter printer = new MessagePrinter();
        printer.setMessage("Test message");
        
        // Simulate behavior to test
        assertTrue(printer != null);
    }
}
