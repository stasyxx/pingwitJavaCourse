package lesson_4.homework;

import java.util.Scanner;

/*
Task 1
Вычислить: 1+2+4+8+...+256
 */
//форматируй код!
public class Sum {
    public static void main(String[] args) {
        int limitPower = 8;
        int maxPower = getMaxPower(limitPower);
        printSum(maxPower, limitPower);
    }
    public static void printSum(int maxPower, int limitPower) {
        if (maxPower <= limitPower && maxPower >0 ) {

            int i = 1;
            int sum = 0;
            double maxNumber = Math.pow(2, maxPower);
            while (i <= maxNumber) {
                sum += i;
                i *= 2;
            }
            System.out.println("Sum of numbers is " + sum);
        } else {
            System.out.println("Ooops....500er500");
        }
 }
 public static int getMaxPower(int limitPower) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter power of two, but less than " + limitPower);
     int maxPower = scan.nextInt();
     return maxPower;
 }
 public static int calculateSum(int maxPower) {
     int i = 1;
     int sum = 0;
     double maxNumber = Math.pow(2, maxPower);
     while (i <= maxNumber) {
         sum += i;
         i *= 2;
     }
     return sum;
}
}
