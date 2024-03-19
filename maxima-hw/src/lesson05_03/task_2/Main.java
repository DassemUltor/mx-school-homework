package lesson05_03.task_2;

public class Main {


    public static void main(String[] args) {
        Integer[] arrayNums = new Integer[10];
        Double[] arrayDoubles = new Double[8];
        String[] arrayStrings = new String[2];

        Storage<Integer> array1 = new Storage<>(arrayNums);
        Storage<Double> array2 = new Storage<>(arrayDoubles);
        Storage<String> array3 = new Storage<>(arrayStrings);

        System.out.println("Массив типа Integer");
        array1.add(5);
        array1.add(2);
        array1.add(7);
        array1.add(9);

        System.out.println(array1);
        System.out.println("Длина массива - " + array1.size());
        System.out.println(array1.get(2));
//      System.out.println(array1.get(15));   // Попытка получения значения за пределами массива
        System.out.println();

        System.out.println("Массив типа Double");
        array2.add(5.8);
        array2.add(9.2);
        array2.add(7.6);

        System.out.println(array2);
        System.out.println("Длина массива - " + array2.size());
        System.out.println(array2.get(1));
        System.out.println();

        System.out.println("Массив типа String");
        array3.add("Hello");
        array3.add("World");
//        array3.add("!!!");                   // Попытка добавления элемента за пределы массива
        System.out.println(array3);
        System.out.println("Длина массива - " + array3.size());
        System.out.println(array3.get(0));


    }


}
