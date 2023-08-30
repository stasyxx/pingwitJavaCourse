package lesson_19.homework.task_2;

import java.util.LinkedList;
import java.util.List;

/*
Task 2
Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран
 */
//отдельные методы?
public class DeleteEven {
    public static void main(String[] args) {
        //почему LinkedList?
        //в названии переменных не должно быть цифр
        List<Integer> elements100 = new LinkedList<>();

        for (int i = 0; i <= 100; i++) {
            elements100.add(0,i);
        }
        System.out.println("List of 100 elements: " + elements100);

        for(int i = elements100.size() - 1; i>=0; i--) {
            if (elements100.get(i) % 2 == 0) {
                elements100.remove(i);
            }
        }
        System.out.println("List of 100 elements after removing even elements: " + elements100);
    }

}
