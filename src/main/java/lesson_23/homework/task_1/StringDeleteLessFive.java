package lesson_23.homework.task_1;

import java.util.List;
import java.util.stream.Collectors;
/*
Task 1. (filter)
Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов
 */
public class StringDeleteLessFive {
    public static void main(String[] args) {
        int limit = 5;
        List<String> listOfString = List.of(
                new String("Kaktus"),
                new String("Bottle"),
                new String("Book"),
                new String("Box"),
                new String("Computer")
        );
        List<String> filteredListOfString = listOfString.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println(filteredListOfString);
    }
}
