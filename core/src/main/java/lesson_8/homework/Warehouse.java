package lesson_8.homework;

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
public class Warehouse {
        private Box[] boxes;
        private int currentBox = 0;
    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }
    public Box[] getBoxes() {
        return boxes.clone();
    }

//тут нужно было реализовывать метод next()
}


