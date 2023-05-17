package lesson_3.homework;
/*
Task 5
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class EvenNumbers {

        public static void main (String[] args) {
            System.out.println("Четные числа от 2 до 100:");
            for ( int number =0 ; number<=100; number++) {
                boolean isEven = false;
                if (number % 2 ==0 ) {
                    isEven = true;
                } if (isEven) {
                    System.out.println( number );
                }
            }
        }
}
