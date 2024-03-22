package lesson13_03.task_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Scanner console = new Scanner(System.in);

        while (true) {
            String text = console.nextLine();

            if (text.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(text.toLowerCase());
        }

        System.out.println("Содержимое коллекции words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
