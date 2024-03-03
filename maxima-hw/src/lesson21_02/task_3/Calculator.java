package lesson21_02.task_3;

public class Calculator {

    public int result;
    public double resultDivide;

    public int sum(int numberOne, int numberTwo) {
        return result = numberOne + numberTwo;
    }

    public int sum(int[] arrayDigit) {
        int temp = 0;
        for (int i : arrayDigit) {
            temp += i;
        }

        return result = temp;
    }

    public int sum(int numberOne, int... nums) {
        int temp = numberOne;
        for (int i : nums) {
            temp += i;
        }

        return result = temp;
    }

    public int subtract(int numberOne, int numberTwo) {
        return result = numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo) {
        return result = numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        return resultDivide = numberOne / numberTwo;
    }
}
