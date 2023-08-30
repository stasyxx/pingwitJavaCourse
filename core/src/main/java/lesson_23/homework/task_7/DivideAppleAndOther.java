package lesson_23.homework.task_7;

import lesson_23.classwork.point_0.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task 8
Есть коллекция телефонов. Нужно разделить на две части, в одной только айфоны, в другой остальные производители.
 */
public class DivideAppleAndOther {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        Map<Boolean, List<Phone>> appleAndOthers = phones.stream()
                .collect(Collectors.partitioningBy(phone->phone.producer().equals("Apple")));
        appleAndOthers.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });

    }
}
