package lesson21_02.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 5);
        assertEquals(10, result);
    }


    @Test
    void testSumArray() {
        Calculator calculator = new Calculator();
        int[] array = {5, 5, 5};
        int result = calculator.sum(array);
        assertEquals(15, result);
    }

    @Test
    void testSumVarargs() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 10, 5);
        assertEquals(20, result);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 5);
        assertEquals(2, result);
    }
}