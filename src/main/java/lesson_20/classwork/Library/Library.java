package lesson_20.classwork.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    private List<Book> books;
    private Set<Reader> readers;

    List<Book> booksList = new ArrayList<>();

    private static void addBooks(ArrayList<String> booksList) {
        booksList.add("Jane Eyre by Charlotte Bronte");
        booksList.add("The Headless Horseman by Mayne Reid");
        booksList.add("Arc de Triomphe by Erich Maria Remarque");
        booksList.add("Pride and Prejudice by Jane Austen");
    }
    private static void removeBooks(ArrayList<String> booksList) {

    }
}
