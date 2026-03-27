package ch.divtec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    // test function add
    @Test
    void addTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void addTwoPositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(2.2, calculator.add(1.1, 1.1));
    }

    @Test
    void addTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void addTwoNegativeFloat() {
        Calculator calculator = new Calculator();

        assertEquals(-2.2, calculator.add(-1.1, -1.1));
    }

    @Test
    void addOneNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.add(1, -2));
    }

    @Test
    void addOneNegativeOnePositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(1.1, calculator.add(2.2, -1.1));
    }

    // test function subtract
    @Test
    void subtractTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.subtract(3, 1));
    }

    @Test
    void subtractTwoPositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(2.1, calculator.subtract(3.2, 1.1));
    }

    @Test
    void subtractTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.subtract(-3, -2));
    }

    @Test
    void subtractTwoNegativeFloat() {
        Calculator calculator = new Calculator();

        assertEquals(-1.9, calculator.subtract(-3.1, -1.2), 0.000000000000001);
    }

    @Test
    void subtractOneNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.subtract(1, -2));
    }

    @Test
    void subtractOneNegativeOnePositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(3.2, calculator.subtract(2.1, -1.1));
    }

    // test function multiply
    @Test
    void multiplyTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    void multiplyTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.multiply(-3, -2));
    }

    @Test
    void multiplyNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(-4, calculator.multiply(2, -2));
    }

    @Test
    void multiplyZeroPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(0, 2));
    }

    @Test
    void multiplyZeroNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(0, (int)calculator.multiply(0, -2));
        assertEquals(0,calculator.multiply(0, -2), 0.000000000000000000000000000000001);
    }

    // test function divide
    @Test
    void divideTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(1.5, calculator.divide(3, 2));
    }

    @Test
    void divideTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(1.5, calculator.divide(-3, -2));
    }

    @Test
    void divideNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.divide(2, -2));
    }

    // Test function factoriel
    @Test
    void factorialPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void factorialNegativeIntegers() {
        Calculator calculator = new Calculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3) ;
        });

        assertEquals("Number must be positive", exception.getMessage());
    }

    @Test
    void factorialPositiveDouble() {
        Calculator calculator = new Calculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(3.5) ;
        });

        assertEquals("Number must be an integer", exception.getMessage());
    }

    @Test
    void factorialZero() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.factorial(0));
    }


}
