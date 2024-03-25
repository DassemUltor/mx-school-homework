package lesson13_03.task_2;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Integer> frequence = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();     // test: hello world hello hello world java


        String[] arrayText = text.split("\\s+");


        for (String s : arrayText) {
            if (frequence.containsKey(s)) {
                frequence.put(s, frequence.get(s) + 1);
            } else {
                frequence.put(s, 1);
            }
        }

        System.out.println(frequence);

    }
}
