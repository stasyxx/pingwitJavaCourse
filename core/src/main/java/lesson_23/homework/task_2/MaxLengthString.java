package lesson_23.homework.task_2;
/*
Task 2 (max, String::compareTo / Comparator.naturalOrder())
Есть коллекция строк, нужно найти строку с максимальной длинной.
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLengthString {

    public static void main(String[] args) {
        List<String> strings = List.of("nothing", "///////", "ppp", "hello world!", "today");
        strings = strings.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(strings);

        String result = strings.get(strings.size() -1);

        System.out.println(result);

    }
}
