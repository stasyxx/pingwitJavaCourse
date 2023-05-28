package lesson_5.homework;

import java.util.Arrays;
import java.util.Scanner;
/*
Task 1
Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран
 */
public class ArrayElements {
    public static void main(String[] args) {
        int lengthArray = 3;
        int[] arrayElements = new int[lengthArray];
        int sumOfArray = userNumbers(arrayElements);
        Arrays.sort(arrayElements);
        System.out.println("Sum of numbers in array: " + sumOfArray);
        System.out.println("The biggest numbers in array: " + arrayElements[lengthArray - 1]);
        System.out.println("The smallest number in array: " + arrayElements[0]);
    }
    public static int userNumbers(int[] array) {
        Scanner scan = new Scanner(System.in);
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " element of the array");
            array[i] = scan.nextInt();
            sumOfArray += array[i];
        }
        return sumOfArray;
    }
}
