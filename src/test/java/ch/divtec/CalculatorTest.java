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

        assertEquals(calculator.sub(3, 1), 2);
    }

    @Test
    void subtractTwoPositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.sub(3.2, 1.1), 2.1);
    }

    @Test
    void subtractTwoNegativeIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.sub(-3, -2), -1);
    }

    @Test
    void subtractTwoNegativeFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.sub(-3.1, -1.2), -1.9);
    }

    @Test
    void subtractOneNegativeOnePositiveIntegers() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.sub(1, -2), 3);
    }

    @Test
    void subtractOneNegativeOnePositiveFloat() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.sub(2.1, -1.1), 3.2);
    }
}
