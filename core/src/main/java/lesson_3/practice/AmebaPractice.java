package lesson_3.practice;

/*
Task 1
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class AmebaPractice {
    public static void main(String[] args) {
        int amebaCount = 1;
        for (int i = 3; i <= 24; i += 3) {
            amebaCount *=  2;
            System.out.println(amebaCount);
        }
        /*
        i:3 -> aC = 1 * 2 = 2;
        i:6 -> aC = 2 * 2 = 4;
        i:9 -> aC = 4 * 2 = 8'
        ...
        i:24 -> aC = 128 * 2;
         */
    }
}
