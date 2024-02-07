package lesson02_02;


public class Main {
    public static void main(String[] args) {

        System.out.println("task 1: " + task1(5));
        System.out.println("task 2: " + task2(5));
        System.out.println("task 3: " + task3(10));
        System.out.println();
        task4_5();
        task6();
        task7();
        task8();
    }

    public static int task1(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = task1(n - 1) + n;

        return result;
    }


    public static int task2(int n) {
        int result;
        if (n == 1) {
            return 1;
        }

        result = task2(n - 1) * n;
        return result;
    }

    public static int task3(int n) {
        int result;
        if (n <= 1) {
            return n;
        }

        result = task3(n - 1) + task3(n - 2);
        return result;
    }

    public static void task4_5() {
        int a = 10;
        double b = 5.0;
        boolean c = false;

        Integer d = Integer.valueOf(a);
        Double e = Double.valueOf(b);
        Boolean f = Boolean.valueOf(c);

        System.out.println("primitive value a - " + a);
        System.out.println("primitive value b - " + b);
        System.out.println("primitive value c - " + c);
        System.out.println();
        System.out.println("wrapper value d - " + d);
        System.out.println("wrapper value e - " + e);
        System.out.println("wrapper value f - " + f);
        System.out.println();
        System.out.println("task 5: arithmetic operations - " + (a + d));
        System.out.println("task 5: arithmetic operations - " + (b + e));
        System.out.println();

    }

    public static void task6() {
        Integer a = 500;
        Integer b = 500;

        Integer c = 100;
        Integer d = 100;

        System.out.println(a == b); // сравнение ссылок
        System.out.println(a.equals(b)); // сравнение значений
        System.out.println();
        System.out.println(c == d);
        System.out.println("При autoboxing не всегда создается действительно новый объект Integer.\n" +
                "Для значений от -128 до 127 включительно объекты кэшируются.");
        System.out.println();
    }


    public static void task7() {
        checkTimeWithPrimitive();
        checkTimeWithWrapper();
        System.out.println();
    }

    public static void checkTimeWithPrimitive() {
        long startTime = System.currentTimeMillis();
        int sum = 0;

        for (int i = 0; i < 100_000_000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время выполнения операции c int: " + duration + " миллисекунд");
    }

    public static void checkTimeWithWrapper() {
        long startTime = System.currentTimeMillis();
        Integer sum = 0;

        for (int i = 0; i < 100_000_000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время выполнения операции c Integer: " + duration + " миллисекунд");
    }

    public static void task8() {

        Integer max = Integer.MAX_VALUE;
        Integer min = Integer.MIN_VALUE;

        Long maxL = Long.MAX_VALUE;
        Long minL = Long.MIN_VALUE;

        System.out.println("Значение константы Integer.MAX_VALUE = " + max);
        System.out.println("Значение константы Integer.MAX_VALUE + 1 = " + (max + 1));
        System.out.println();
        System.out.println("Значение константы Integer.MIN_VALUE  = " + min);
        System.out.println("Значение константы Integer.MIN_VALUE - 1 = " + (min - 1));
        System.out.println();

        System.out.println("Значение константы Long.MAX_VALUE = " + maxL);
        System.out.println("Значение константы Long.MAX_VALUE + 1 = " + (maxL + 1));
        System.out.println();
        System.out.println("Значение константы Long.MIN_VALUE  = " + minL);
        System.out.println("Значение константы Long.MIN_VALUE - 1 = " + (minL - 1));

    }
}
