// De Nathan Juillerat Le Goat
package ch.divtec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            logger.error("Attempted division by zero: {}/{}", a, b);
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    long factorial(double n) {
        if (n != (int)n) {
            logger.error("Factorial input is not an integer: {}", n);
            throw new IllegalArgumentException("Number must be an integer");
        }
        if (n < 0) {
            logger.error("Factorial input is negative: {}", n);
            throw new IllegalArgumentException("Number must be positive");
        }
        if (n <= 1) {
            return 1;
        }

        return (int)n + factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("Allowed operators: + - * / !");
        logger.info("Enter the operation to compute :");

        double num1 = sc.nextDouble();
        char operator = sc.next().charAt(0);

        double num2 = 0;
        if (operator != '!') {
            num2 = sc.nextDouble();
        }

        final Calculator calc = new Calculator();

        double result;
        switch (operator) {
            case '+':
                result = calc.add(num1, num2);
                break;
            case '-':
                result = calc.subtract(num1, num2);
                break;
            case '*':
                result = calc.multiply(num1, num2);
                break;
            case '/':
                result = calc.divide(num1, num2);
                break;
            case '!':
                result = calc.factorial(num1);
                break;
            default:
                logger.warn("Invalid operator: {}", operator);
                return;
        }

        logger.info("The final result: {} {} {} = {}", num1, operator, num2, result);
    }
}
