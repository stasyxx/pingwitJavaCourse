package lesson_24.homework.task_2;
/*
Task 2 (limit, reduce)
Есть коллекция чисел, найти произведение первых 5ти элементов.
 */

import java.util.Arrays;
import java.util.List;
//ты нашла сумму, а не произвведение :)
public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sumOfFive = numbers.stream()
                .limit(5)
                .reduce(0, Integer::sum);
        System.out.println(sumOfFive);

    }
}
