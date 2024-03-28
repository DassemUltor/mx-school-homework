package lesson15_03.task_3;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(74);
        list.add(1);
        list.add(41);
        list.add(95);
        list.add(6);

        int sum = list.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println("Сумма всех чисел в списке: " + sum);
        System.out.println("Среднее значение всех чисел в списке: " + (sum / list.size()));

        long countNumbersOverTen = list.stream()
                .filter(element -> element > 10)
                .count();


        System.out.println("Количество чисел в списке, с значением выше 10: " + countNumbersOverTen);
    }
}
