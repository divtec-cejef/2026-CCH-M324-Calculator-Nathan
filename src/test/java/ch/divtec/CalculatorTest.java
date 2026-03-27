package ch.divtec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // test function add
    @Test
    void addTwoPositiveIntegers() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void addTwoPositiveFloat() {
        assertEquals(2.2, calculator.add(1.1, 1.1));
    }

    @Test
    void addTwoNegativeIntegers() {
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void addTwoNegativeFloat() {
        assertEquals(-2.2, calculator.add(-1.1, -1.1));
    }

    @Test
    void addOneNegativeOnePositiveIntegers() {
        assertEquals(-1, calculator.add(1, -2));
    }

    @Test
    void addOneNegativeOnePositiveFloat() {
        assertEquals(1.1, calculator.add(2.2, -1.1));
    }

    // test function subtract
    @Test
    void subtractTwoPositiveIntegers() {
        assertEquals(2, calculator.subtract(3, 1));
    }

    @Test
    void subtractTwoPositiveFloat() {
        assertEquals(2.1, calculator.subtract(3.2, 1.1));
    }

    @Test
    void subtractTwoNegativeIntegers() {
        assertEquals(-1, calculator.subtract(-3, -2));
    }

    @Test
    void subtractTwoNegativeFloat() {
        assertEquals(-1.9, calculator.subtract(-3.1, -1.2), 0.000000000000001);
    }

    @Test
    void subtractOneNegativeOnePositiveIntegers() {
        assertEquals(3, calculator.subtract(1, -2));
    }

    @Test
    void subtractOneNegativeOnePositiveFloat() {
        assertEquals(3.2, calculator.subtract(2.1, -1.1));
    }

    // test function multiply
    @Test
    void multiplyTwoPositiveIntegers() {
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    void multiplyTwoNegativeIntegers() {
        assertEquals(6, calculator.multiply(-3, -2));
    }

    @Test
    void multiplyNegativeOnePositiveIntegers() {
        assertEquals(-4, calculator.multiply(2, -2));
    }

    @Test
    void multiplyZeroPositiveIntegers() {
        assertEquals(0, calculator.multiply(0, 2));
    }

    @Test
    void multiplyZeroNegativeIntegers() {
        assertEquals(0, (int)calculator.multiply(0, -2));
        assertEquals(0,calculator.multiply(0, -2), 0.000000000000000000000000000000001);
    }

    // test function divide
    @Test
    void divideTwoPositiveIntegers() {
        assertEquals(1.5, calculator.divide(3, 2));
    }

    @Test
    void divideTwoNegativeIntegers() {
        assertEquals(1.5, calculator.divide(-3, -2));
    }

    @Test
    void divideNegativeOnePositiveIntegers() {
        assertEquals(-1, calculator.divide(2, -2));
    }

    @Test
    void dividePositiveZeroIntegers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(2, 0);
        });

        assertEquals("Division by zero", exception.getMessage());
    }

    // Test function factoriel
    @Test
    void factorialPositiveIntegers() {
        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void factorialNegativeIntegers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3) ;
        });

        assertEquals("Number must be positive", exception.getMessage());
    }

    @Test
    void factorialPositiveDouble() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(3.5) ;
        });

        assertEquals("Number must be an integer", exception.getMessage());
    }

    @Test
    void factorialZero() {
        assertEquals(1, calculator.factorial(0));
    }
}
