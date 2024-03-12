package Lesson01_03.task_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        int num;
        boolean b = true;
        Scanner console = new Scanner(System.in);

        while (b) {
            System.out.println("Введите число");

            try {
                num = console.nextInt();
                System.out.println(num * 2);
                b = false;
                console.close();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не числовое значение\nПопробуйте еще раз");
                console.nextLine();

            }
        }
    }

}
