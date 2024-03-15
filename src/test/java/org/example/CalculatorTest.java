package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
