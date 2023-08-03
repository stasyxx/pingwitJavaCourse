package lesson_23.homework.task_3;

import lesson_23.classwork.point_0.Phone;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 3 (map + filter)
Есть коллекция телефонов. У телефона есть название и производитель. Необходимо получить из этой коллекции коллекцию производителей (производитель - это строка)
и оставить только те, которые входят в список: Apple, Samsung, Xiaomi
 */
public class PhoneProducer {
    public static void main(String[] args) {

        List<lesson_23.classwork.point_0.Phone> phones = List.of(
                new Phone("IPhone 13 Pro", "Apple", 900),
                new Phone("Redmi Note", "Xiaomi", 800),
                new Phone("S10", "Samsung", 700),
                new Phone("Experio", "Sony", 600),
                new Phone("Lumia", "Nokia", 300)
        );

        List<String> producers = phones.stream()
                .map(Phone::producer)
                .filter(producer -> producer.equals("Apple") || producer.equals("Xiaomi") || producer.equals("Samsung"))
                .collect(Collectors.toList());

        System.out.println(producers);

    }
}
