package lesson30_01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
//        doFirstHomework();
    }


    public static void task1() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void task2() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static double task3() {
        double[] array = new double[10];
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 10);
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }


    public static void task4() {
        System.out.println(concat(buildString()));
    }

    public static String[] buildString() {
        String phrase = "Вошли и вышли, приключение на 20 минут";
        String[] array = phrase.split(" ");
        return array;
    }

    static String concat(String[] stringArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void doFirstHomework() {
//     1. Объявите переменные типа int, byte, short, long, float, double, char, boolean.
//      Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».


        byte a = 100;
        short b = 327;
        int c = 21489;
        long d = 4180048L;
        float e = 4124.43F;
        double f = 3814.13;
        char g = '\u0231';
        boolean h = false;

        System.out.println("Значение переменной " + "a с типом byte, равно " + a);
        System.out.println("Значение переменной " + "b с типом short, равно " + b);
        System.out.println("Значение переменной " + "d с типом int, равно " + c);
        System.out.println("Значение переменной " + "e с типом long, равно " + d);
        System.out.println("Значение переменной " + "c с типом float, равно " + e);
        System.out.println("Значение переменной " + "f с типом double, равно " + f);
        System.out.println("Значение переменной " + "g с типом char, равно " + g);
        System.out.println("Значение переменной " + "h с типом boolean, равно " + h);
        System.out.println();


//         2. На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//         На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
//         Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».

        int quantityCans = 120;
        int cansWhite = 2;
        int cansBrown = 4;
        int quantityRooms = quantityCans / (cansWhite + cansBrown);

        System.out.println("В школе, где " + quantityRooms + " классов, нужно " + quantityRooms * cansWhite + " банок белой краски и " + quantityRooms * cansBrown + " банок коричневой краски");

        System.out.println();

/*
        3. К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        Маша получает 67 760 рублей в месяц.
                Денис получает 83 690 рублей в месяц.
                Кристина получает 76 230 рублей в месяц.
                Каждому нужно увеличить зарплату на 10% от текущей месячной.
                Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
*/

        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryCristina = 76230;


        System.out.println("Маша теперь получает " + (salaryMasha + (salaryMasha / 10)) + " рублей. " + "Годовой доход вырос на " + 12 * (salaryMasha / 10) + " рублей");
        System.out.println("Денис теперь получает " + (salaryDenis + (salaryDenis / 10)) + " рублей. " + "Годовой доход вырос на " + 12 * (salaryDenis / 10) + " рублей");
        System.out.println("Кристина теперь получает " + (salaryCristina + (salaryCristina / 10)) + " рублей. " + "Годовой доход вырос на " + 12 * (salaryCristina / 10) + " рублей");

        System.out.println();



/*
        4. Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:

        «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        При выполнении каждого условия выведите в консоль: «На улице … градусов,
        (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».
 */

        int currentTemperature = 0;

        if (currentTemperature < 5) {
            System.out.println("На улице " + currentTemperature + " градусов");
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + currentTemperature + " градусов");
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println();

/*
        5. (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
*/
        int monthNumber = 5;
        String season = null;

        if (monthNumber <= 12 && monthNumber >= 1) {

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;

            }
            System.out.println("Cейчас " + season);
        } else {
            System.out.println("Такого месяца не существует");
        }

        System.out.println();

/*
        6. Выведите в консоль все четные числа от 0 до 17 с помощью цикла.
        (использовать в теле цикла вложенное условие if с проверкой, что остаток от деления на 2 равен нулю)

*/
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();


//        7. С помощью цикла for выведите в консоль все числа от 10 до 1.

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        System.out.println();

/*
        8. С помощью цикла while посчитайте,
        сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль с тем количеством месяцев,
        которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
*/
        int money = 0;
        int count = 0;

        while (money <= 2_459_000) {
            money += 15_000;
            count++;
        }
        System.out.println("Месяц " + count + " , сумма накоплений равна " + money + " рублей.");

    }
}

