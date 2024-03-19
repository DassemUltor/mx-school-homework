package lesson05_03.task_3;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        Integer[] array1 = {4, 7, 6, 9, 35};
        String[] array2 = {"Hello", "World", "Bye", "!!!"};


        System.out.println("Массив до метода swap " + Arrays.toString(array1));
        swap(array1, 1, 4);
        System.out.println("Массив после метода swap " + Arrays.toString(array1));
        System.out.println();
        System.out.println("Массив до метода swap " + Arrays.toString(array2));
        swap(array2, 0, 2);
        System.out.println("Массив после метода swap " + Arrays.toString(array2));

    }


    static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
