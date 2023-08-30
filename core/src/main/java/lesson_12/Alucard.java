package lesson_12;
/*
Task 2
Есть слово “alucard”. Нужно изменить порядок букв на обратный.
 */
public class Alucard {
    public static void main(String[] args) {
        String alucard = "alucard";
        StringBuilder strB = new StringBuilder(alucard);
        StringBuilder reverseAlucard = strB.reverse();
        System.out.println(reverseAlucard);
    }
}
