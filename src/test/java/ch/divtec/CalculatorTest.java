package ch.divtec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    // test function add
    @Test
    void addTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(1, 1), 2);
    }

    @Test
    void addTwoPositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(1.1, 1.1), 2.2);
    }

    @Test
    void addTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(-1, -1), -2);
    }

    @Test
    void addTwoNegativeFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(-1.1, -1.1), -2.2);
    }

    @Test
    void addOneNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(1, -2), -1);
    }

    @Test
    void addOneNegativeOnePositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(2.2, -1.1), 1.1);
    }

    // test function sub
    @Test
    void subtractTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(3, 1), 2);
    }

    @Test
    void subtractTwoPositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(3.2, 1.1), 2.1);
    }

    @Test
    void subtractTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(-3, -2), -1);
    }

    @Test
    void subtractTwoNegativeFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(-3.1, -1.2), -1.9);
    }

    @Test
    void subtractOneNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(1, -2), 3);
    }

    @Test
    void subtractOneNegativeOnePositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(2.1, -1.1), 3.2);
    }

    // test
    @Test
    void multiplyTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.multiply(3, 2), 6);
    }

    @Test
    void multiplyTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.multiply(-3, -2), 6);
    }

    @Test
    void multiplyNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.multiply(2, -2), -4);
    }

    // test
    @Test
    void divideTwoPositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.divide(3, 2), 1.5);
    }

    @Test
    void divideTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.divide(-3, -2), 1.5);
    }

    @Test
    void divideNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.divide(2, -2), -1);
    }
}
