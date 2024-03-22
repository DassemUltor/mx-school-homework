package lesson13_03.task_1;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.addNumber("Alice", "+79409528512");
        phoneBook.addNumber("David", "+79817428419");
        phoneBook.addNumber("Anna", "+79097562785");
        phoneBook.addNumber("Tom", "+791169346941");

        System.out.println(phoneBook);
        System.out.println();

        phoneBook.searchNumber("Tom");
        phoneBook.searchNumber("Robin");
        System.out.println();

        phoneBook.deleteNumber("Anna");
        phoneBook.deleteNumber("Tomas");

        System.out.println(phoneBook);

    }
}
