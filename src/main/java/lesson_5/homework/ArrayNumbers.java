package lesson_5.homework;
/*
Task 2
Есть массив чисел. Найти среднее арифметическое число элементов массива
 */
public class ArrayNumbers {
    public static void main(String[] args) {
        int[] array = {4, 15, 80, 21, 66};
        int sumOfArray = countSumOfArrayNum(array);
        int averageArray = (sumOfArray / array.length);
        System.out.println("Average of the array numbers: " + averageArray);
    }

    public static int countSumOfArrayNum(int[] array) {
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        return sum;
    }
}