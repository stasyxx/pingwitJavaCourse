package lesson_4.homework;

import java.util.Scanner;
/*
Task 2
Напишите программу вывода всех четных чисел от 2 до 100 включительно (2, 100 - числа пользователя)
 */
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of the range: ");
        int end = scanner.nextInt();

        //что такое 2 и 100? Это лежит в переменной пользотеля. Если ты хочешь ввести лимиты, то создай соответствующие переменные :) 
        if (start < 2 || end > 100) {
            System.out.println("Oops... You are out of the range");
        } else {
            System.out.println("Even numbers from " + start + " to " + end + ":");
            //пустая строка
            printEvenNumbers(start, end);
        }
    }

    public static void printEvenNumbers(int start, int end) {
        int number = start;

        while (number <= end) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            //пустая строка
            number++;
        }
    }
}
