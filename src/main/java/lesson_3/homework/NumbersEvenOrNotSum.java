package lesson_3.homework;
/*
Task 7
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class NumbersEvenOrNotSum {
    public static void main (String[] args) {

        int sum1 = 0;
        for ( int number = 0; number <= 100; number++) {
            if (number % 2 == 0) {
                sum1 += number;
            }
        }
        System.out.println("Сумма четных чисел от 1 до 100: " + sum1);
        int sum2 = 0;
        for (int number =0; number <= 100; number ++) {
            if (number %2 != 0) {
                sum2 += number;
            }
        }
        System.out.println ("Сумма нечетных чисел от 1 до 100: " + sum2);
        int sum3 = sum1 + sum2;
        System.out.println ("Сумма всех чисел: " + sum3);
    }
}

