package lesson10_03.task_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Апельсин");
        firstList.add("Банан");
        firstList.add("Яблоко");
        firstList.add("Гранат");
        firstList.add("Груша");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Капуста");
        secondList.add("Морковь");
        secondList.add("Картофель");
        secondList.add("Свекла");
        secondList.add("Брокколи");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(firstList);
        linkedList.addAll(secondList);


        System.out.println("linkedList содержит весь список фруктов: " + linkedList.containsAll(firstList));
        System.out.println("linkedList содержит весь список овощей: " + linkedList.containsAll(secondList));
        System.out.println();

        linkedList.removeAll(secondList);
        System.out.println("Содержимое linkedList после удаления коллекции овощей:");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }

}
