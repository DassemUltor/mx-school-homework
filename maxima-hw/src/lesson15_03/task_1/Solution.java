package lesson15_03.task_1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Пока");
        stringList.add("Привет");
        stringList.add("Как дела?");
        stringList.add("Ок");


        stringList.stream()
                .filter((s) -> s.length() > 5)
                .sorted((s1, s2) -> s2.compareTo(s1))  // oder Comparator.reverseOrder
                .forEach(System.out::println);

    }
}
