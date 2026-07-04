package org.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    void testNegativeAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(-5, 2);

        assertEquals(-3, result);
    }

    @Test
    void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(20, 10);

        assertEquals(10, result);
    }

    @Test
    void testMultiplication() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(5, 6);

        assertEquals(30, result);
    }

    @Test
    void testDivision() {

        Calculator calculator = new Calculator();

        int result = calculator.divide(20, 5);

        assertEquals(4, result);
    }

    @Test
    void testDivideByZero() {

        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}