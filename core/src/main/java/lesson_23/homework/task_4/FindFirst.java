package lesson_23.homework.task_4;

import java.util.List;
import java.util.Optional;

/*
Task 4 (filter + findFirst)
Есть коллекция чисел, найти первое, которое будет больше 22.
 */
public class FindFirst {
    public static void main(String[] args) {
        int minNumber = 22;
        List<Integer> numbers = List.of(10, 13, 54, 2, 34, 21, 56, 90, 0, 3);

        Optional<Integer> firstNum = numbers.stream()
                .filter(i -> i > minNumber)
                .findFirst();
        System.out.println(firstNum);
    }
}
