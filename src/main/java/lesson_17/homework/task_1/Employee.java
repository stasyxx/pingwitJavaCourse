package lesson_17.homework.task_1;

import java.io.Serializable;

/*
Task 1
Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
У Employee есть имя, возраст и работа (work).
Запишите объект Employee в файл, затем восстановите его обратно в объект.
 */
public class Employee implements Serializable {
    private String name;
    private int age;
    private Work work;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
