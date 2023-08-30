package lesson_3.homework;

/*
Task 6
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class NotEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Сумма нечетных чисел от 1 до 99:");
        int sum = 0;
        for (int number = 0; number <= 99; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
