package lesson_4.lesson;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("After for loop");
    }
}
