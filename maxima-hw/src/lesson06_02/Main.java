package lesson06_02;

public class Main {

    public static void main(String[] args) {

        Author rkMorgan = new Author("Richard", "Morgan");
        Author sErikson = new Author("Steven", "Erikson");

        Book aCarbon = new Book("Altered Carbon", 2002, rkMorgan);
        Book malazB = new Book("Malazan Book of the Fallen", 1999, sErikson);
        System.out.println(aCarbon);
        System.out.println(malazB);

        System.out.println("Изменили год книги с помощью сеттера:");
        malazB.setYearRelease(2011);
        System.out.println(malazB);
        System.out.println();

        BonusTask bonus = new BonusTask();
        System.out.println("BonusT: до вызова метода primitive: " + bonus.primitive);
        bonus.passByPrimitive(bonus.primitive);
        System.out.println("После вызова метода primitive: " + bonus.primitive);
        System.out.println();
        System.out.println("BonusT: до вызова метода Object: " + bonus.array[3]);
        bonus.passByObject(bonus.array);
        System.out.println("После вызова метода Object: " + bonus.array[3]);
    }


}
