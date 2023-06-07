package lesson_4.lesson;

public class WhileLoopExample {
    public static void main(String[] args) {
        /*
            while(condition) {
                code-code
            }
         */
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;
        }

          /*
          do {
          code
          }while(condition);
         */
        System.out.println("=====");
        int x = 1;
        do {
            System.out.println("The of x is: " + x);
            x++;
        } while (x < 1);
    }
}
