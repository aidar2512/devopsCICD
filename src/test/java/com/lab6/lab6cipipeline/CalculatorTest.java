package com.lab6.lab6cipipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(0.0, calculator.add(-1, 1));
        assertEquals(0.0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3));
        assertEquals(-5.0, calculator.subtract(0, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3));
        assertEquals(-6.0, calculator.multiply(-2, 3));
        assertEquals(0.0, calculator.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(3.0, calculator.divide(6, 2));
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () ->
                calculator.divide(5, 0)
        );
    }
}
