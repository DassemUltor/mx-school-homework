package lesson13_03.task_1;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> book;

    public PhoneBook(HashMap<String, String> book) {
        this.book = book;
    }

    public void searchNumber(String name) {
        System.out.println(book.getOrDefault(name, "Такой записи в книге нет."));
    }

    public void addNumber(String name, String number) {
        book.put(name, number);
        System.out.println("Добавлен новый контакт: " + name + " " + number);
    }

    public void deleteNumber(String name) {
        if (book.containsKey(name)) {
            book.remove(name);
            System.out.println("Запись с именем " + name + " удалена!");
        } else {
            System.out.println("Такой записи в книге нет.");
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{"
                + book +
                '}';
    }
}
