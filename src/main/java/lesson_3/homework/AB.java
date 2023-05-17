package lesson_3.homework;
/*
Task 3
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class AB {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        for (int i = 0; i < b; i++) {
            a += 3;
        }
        System.out.println("A = " +a);
    }
}