package lesson05_03.task_1;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Ведьмак", "Анджей Сапковский", 1986);
        Book book2 = new Book("Атлант расправил плечи", "Айн Рэнд", 1957);
        Book book3 = new Book("ведьмак", "Анджей Сапковский", 1900);

        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Это разные книги");
        }
        System.out.println(book1);
        System.out.println(book2);
        System.out.println();
        if (book1.equals(book3)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Это разные книги");
        }
        System.out.println(book1);
        System.out.println(book3);


    }
}
