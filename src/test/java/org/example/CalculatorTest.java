package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0f, calculator.add(2.0f, 3.0f), 0.001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2.0f, calculator.subtract(5.0f, 3.0f), 0.001);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0f, calculator.divide(6.0f, 3.0f), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6.0f, 0.0f);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6.0f, calculator.multiply(2.0f, 3.0f), 0.001);
    }
}
