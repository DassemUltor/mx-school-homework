package lesson13_03.task_4;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            firstSet.add(i);
        }

        Set<Integer> secondSet = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            secondSet.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        System.out.println("Пересечение множеств: " + intersection);

        HashSet<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);
        System.out.println("Объединение множеств: " + union);

        HashSet<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);
        System.out.println("Разность первого множества и второго: " + difference);


    }
}
