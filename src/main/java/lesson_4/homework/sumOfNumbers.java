package lesson_4.homework;

    import java.util.Scanner;
//1. Форматируй код!!!!!!! 2. Названия классов с большой буквы
    public class sumOfNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int start = scanner.nextInt();

            System.out.print("Enter second number: ");
            int end = scanner.nextInt();

            int evenSum = calculateEvenSum(start, end);
            int oddSum = calculateOddSum(start, end);
            int totalSum = calculateTotalSum(start, end);

            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
            System.out.println("Total sum: " + totalSum);
        }

        public static int calculateEvenSum(int start, int end) {
            int sum = 0;
            int number = start;

            while (number <= end) {
                if (number % 2 == 0) {
                    sum += number;
                }
                number++;
            }

            return sum;
        }

        public static int calculateOddSum(int start, int end) {
            int sum = 0;
            int number = start;

            while (number <= end) {
                if (number % 2 != 0) {
                    sum += number;
                }
                number++;
            }

            return sum;
        }
        //тотал = четные + нечетные, сумму которых ты уже посчитала
        public static int calculateTotalSum(int start, int end) {
            int sum = 0;
            int number = start;

            while (number <= end) {
                sum += number;
                number++;
            }

            return sum;
        }
    }


