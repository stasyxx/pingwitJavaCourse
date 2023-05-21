package lesson_4.homework;
/*
Task 3
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99 (1, 99 - числа пользователя)
 */

// какие бы числа я не вводила, выводит 0, не могу понять почему.
// поняла, что из-за Start, но не поняла, что с ним делать

import java.util.Scanner;
public class SumOddNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int start = scanner.nextInt();

            System.out.print("Enter second number: ");
            int end = scanner.nextInt();

            if (start < 1 || end > 99) {
                System.out.println("Oops... you are out of the range");
            } else {
                int sum = calculateSumOfOddNumbers(start, end);
                System.out.println("Sum of odd numbers from " + start + " to " + end + ": " + sum);
            }
        }

        public static int calculateSumOfOddNumbers(int start, int end) {
            int sum = 0;
            int number = start; // (start % 2 == 0)

            while (number <= end) {
                if (number % 2 != 0) {
                    sum += number;

                }
                number++;

            }

            return sum;
        }
    }


