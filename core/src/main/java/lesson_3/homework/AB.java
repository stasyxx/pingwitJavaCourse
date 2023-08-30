package lesson_3.homework;
/*
Task 3
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
//+
public class AB {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        for (int i = 0; i < b; i++) {
            //почему +3?
            a += 3;
        }
        System.out.println("A = " +a);//с твоими числами результат 12, хотя 0*4=0
    }
}
