package lesson_3.practice;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for (initialization expression; condition; update-expression) {
            //body
        }
         */
        for (int i = 0; i <= 99; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i <= 99; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("After for loop");

        for (int i = -3; i <= 3; i+=2) {
            System.out.println(i);
        }
    }
}
