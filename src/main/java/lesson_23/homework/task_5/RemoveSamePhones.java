package lesson_23.homework.task_5;

import lesson_23.classwork.point_0.Phone;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 6 (distinct)
Есть коллекция телефонов, нужно убрать все повторяющиеся
 */
public class RemoveSamePhones {
    public static void main(String[] args) {
        List<Phone> phoneList = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("8", "Apple", 400),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> uniquePhones = phoneList.stream()
                .distinct()
                .collect(Collectors.toList());
        uniquePhones.forEach(System.out::println);
    }
}
