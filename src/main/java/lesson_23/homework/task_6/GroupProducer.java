package lesson_23.homework.task_6;

import lesson_23.classwork.point_0.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task 7
Есть коллекция телефонов, нужно сгруппировать по компании и вывести на экран
 */
public class GroupProducer {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        Map<String, List<Phone>> producerToPhonesMap = phones.stream()
                .collect(Collectors.groupingBy(Phone::producer));
        producerToPhonesMap.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
