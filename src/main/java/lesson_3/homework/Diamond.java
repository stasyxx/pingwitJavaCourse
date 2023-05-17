package lesson_3.homework;
/*
Task 8
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *
 */
// я сразу начала рисовать ромб, запуталась и затупила........
public class Diamond {
        public static void main(String[] args) {
            int size = 5;
            for (int line = 1; line <= 5; line++) {
                for (int space = size - line; space >= 1; space--) {
                    System.out.print(" ");
                }
                // for (int star = 1; не понимаю, что за условие тут должно быть ; star++);
                System.out.print("*");

                System.out.println();
            }

            for (int line = size - 1; line >= 1; line--) {
                for (int space = 1; space <= size - line; space++) {
                    System.out.print(" ");
                }
                // for (int star = 1; не понимаю, что за условие тут должно быть ; star-- );
                System.out.print("*");

                System.out.println();
            }
        }
}

