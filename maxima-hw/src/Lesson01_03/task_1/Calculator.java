package Lesson01_03.task_1;

public class Calculator {

    public static int divide(int a, int b) {
        int result;

        try {
            result = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Попытка деления на 0");
            return 0;
        } finally {
            System.out.println("Метод деления завершен");

        }
        return result;
    }
}
