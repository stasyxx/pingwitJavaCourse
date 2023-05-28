package lesson_6.homework;

import lesson_6.practice.Person;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 3
Создайте массив, состоящий из объектов класса из 'Task 2'. Выведите полученный массив на экран, должны отображаться
названия полей класса и их значения.

 */
public class ArrayPerson {
    public static void main(String[] args) {
        int amount = amountOfPeople();
        String[] array = new String[amount];
        int iteration = 0;
        while (iteration < amount) {
            array[iteration] = newPerson();
            iteration++;

        }
        System.out.print(Arrays.toString(array));
    }
    public static int amountOfPeople() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you want to add?");
        int amount = scan.nextInt();
        return amount;
    }
    public static String newPerson() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name of the person: ");
            String name = scan.next();
            System.out.println("Enter age of the person" + name );
            int age = scan.nextInt();
            Person person = new Person(name, (byte) age);
            String nameAge = person.toString();
            return nameAge;

}
}
