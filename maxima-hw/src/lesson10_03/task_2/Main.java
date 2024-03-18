package lesson10_03.task_2;

public class Main {

    public static void main(String[] args) {


        BookShelf shelf = new BookShelf();
        shelf.addBook("Ведьмак");
        shelf.addBook("Полари");
        shelf.addBook("Малазанская книга павших");
        shelf.addBook("Подсказчик");

        shelf.removeBook("Малазанская книга павших");
        System.out.println();

        shelf.listBooks();

    }
}
