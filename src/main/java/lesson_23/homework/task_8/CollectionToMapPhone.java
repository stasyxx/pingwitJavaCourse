package lesson_23.homework.task_8;

import lesson_23.classwork.point_0.Phone;

import java.util.List;
import java.util.Map;

/*
Task 9
Есть коллекция телефонов, сделать из нее мапу:
которой ключ - это производитель
вэлью - это кол-во телефонов этого производителя в исходной коллекции
 */
public class CollectionToMapPhone {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

    }
}
