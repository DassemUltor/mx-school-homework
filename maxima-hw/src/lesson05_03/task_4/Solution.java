package lesson05_03.task_4;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(9);
        list1.add(2);
        System.out.println("Сумма всех эементов равна " + sumOfList(list1));
        System.out.println();
        List<Double> list2 = new ArrayList<>();
        list2.add(2.5);
        list2.add(7.2);
        list2.add(9.1);
        list2.add(6.4);
        System.out.println("Сумма всех эементов равна " + sumOfList(list2));

    }


    static double sumOfList(List<? extends Number> list) {
        double result = 0;

        for (Number number : list) {
            result = result + number.doubleValue();
        }
        return result;
    }


}
