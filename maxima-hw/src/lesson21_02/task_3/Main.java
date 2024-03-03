package lesson21_02.task_3;


public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int[] array = {1, 3, 5, 7, 8};

        System.out.println("Сложение 2-х чисел: " + calculator.sum(2, 3));
        System.out.println("Вычитание 2-х чисел: " + calculator.subtract(10, 9));
        System.out.println("Умножение 2-х чисел: " + calculator.multiply(5, 10));
        System.out.println("Деление 2-х чисел: " + calculator.divide(11, 3));
        System.out.println("Сложение значений массива: " + calculator.sum(array));
        System.out.println("Сложение аргументов переменной длины: " +
                calculator.sum(1, 4, 7, 2, 7, 8, 1, 36, 9, 6));


    }


}
