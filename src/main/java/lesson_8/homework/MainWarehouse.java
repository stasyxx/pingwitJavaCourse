package lesson_8.homework;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 1
Создать класс Warehouse, внутри которого массив класса Box (с любыми полями - например name, weight - сделать его через record).
Массив должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после этого нельзя.
В классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()
 */

// я примерно понимаю, что надо делать, но не понимаю КАК это сделать, так что вышло, что хваталась за всё......
public class MainWarehouse {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box("banana", 6),
                new Box("mango", 4),
                new Box("kiwi", 9)
        };
        Warehouse warehouse = new Warehouse(boxes);

    }
    static void getBoxes() {
        int currentBox = 0;
        int length = 3;
        int[] arrayBoxeslength = new int[length];
        for (int i = 0; i <= 6; i++) {
            System.out.println(arrayBoxeslength[i++]);
        }
                System.out.println(Arrays.toString(arrayBoxeslength));
        // return currentBox;
    }
}
/* 3:   static int getBoxName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We have boxes with banana, mango and kiwi. Enter name of fruit and I'll tell you what is laying next to it.");
        int boxName = scanner.nextInt();
        return boxName;
        } */

/* 2:   do {
            currentBox++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("We have boxes with banana, mango and kiwi. Enter name of fruit and I'll tell you what is laying next to it.");
            int boxName = scanner.nextInt();
            arrayBoxeslength[currentBox] = scanner.nextInt();
            System.out.println(currentBox);
        } while (currentBox <= length);
        return currentBox;
        */

/* 1:    for (currentBox = 0, currentBox <= length, currentBox++) {
            Scanner scanner = new Scanner(System.in);
            arrayBoxeslength[currentBox] = scanner.nextInt();

        } */