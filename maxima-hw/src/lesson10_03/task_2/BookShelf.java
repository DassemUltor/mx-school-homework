package lesson10_03.task_2;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<String> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("Книга \"" + bookName + "\" добавлена в список.");
    }

    void removeBook(String bookName) {
        books.remove(bookName);
        System.out.println("Книга \"" + bookName + "\" удалена из списка.");
    }

    void listBooks() {
        System.out.println("Список всех книг: ");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
