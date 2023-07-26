package lesson_21.homework.task_3;
/*
Task 3
Есть неупорядоченный склад с фруктами (допустим это List<Fruits>).
У фрукта есть название и кол-во в кг и тип (например, цитрусовые, косточковые, тропические)
Нужно произвести переучет:
- сгруппировать фрукты по типу
- посчитать весь каждого из фруктов
- отсортировать фрукты по названию
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitWarehouse {
    public static void main(String[] args) {
        List<Fruits> warehouse = new LinkedList<>();
        warehouse.add(new Fruits("banana", 3.2, "tropical"));
        warehouse.add(new Fruits("coconut", 5.7, "tropical"));
        warehouse.add(new Fruits("mango", 1.1, "stone fruit"));
        warehouse.add(new Fruits("orange", 7.3, "citrus"));
        warehouse.add(new Fruits("lime", 2.0, "citrus"));
        warehouse.add(new Fruits("plum", 6.9, "stone fruit"));
        warehouse.add(new Fruits("coconut", 1.2, "tropical"));
        warehouse.add(new Fruits("orange", 2.0, "citrus"));

        Map<String, List<Fruits>> fruitsByType = warehouse.stream().collect(Collectors.groupingBy(Fruits::getType));
        for (Map.Entry<String, List<Fruits>> itemType : fruitsByType.entrySet()) {
            System.out.println(itemType.getKey());
            for (Fruits fruits : itemType.getValue()) {
                System.out.println(fruits.getName());
            }
            System.out.println();
        }

       /*
        Map<String, List<Fruits>> fruitsByName = warehouse.stream().collect(Collectors.groupingBy(Fruits::getName));
        for (Map.Entry<String, List<Fruits>> itemName : fruitsByName.entrySet()) {
            for (Fruits fruits : itemName.getValue()) {
                System.out.println(fruits.getName());
            }
        } */

        Map<String, Double> fruitsCount = warehouse.stream().collect(Collectors.groupingBy(Fruits::getName, Collectors.summingDouble(Fruits::getKg)));
        for (Map.Entry<String, Double> itemKg : fruitsCount.entrySet()) {
            System.out.println(itemKg.getKey() + " - " + itemKg.getValue());
        }
    }

}
