package lesson13_03.task_2;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Integer> frequence = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();     // test: hello world hello hello world java
        int value = 1;

        String[] arrayText = text.split("\\s+");

        for (int i = 0; i < arrayText.length; i++) {
            if (frequence.containsKey(arrayText[i])) {
                continue;
            }
            for (int j = i + 1; j < arrayText.length; j++) {
                if (arrayText[i].equalsIgnoreCase(arrayText[j])) {
                    value++;
                }
            }
            frequence.put(arrayText[i], value);
            value = 1;
        }

        System.out.println(frequence);

    }
}
