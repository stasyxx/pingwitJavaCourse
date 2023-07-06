package lesson_16.homework.task_2;

import java.io.FileWriter;
import java.io.IOException;

/*
Task 2
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз
 */
public class TextOutput {
    private static final String FILE_PATH = ("src/main/java/lesson_16/homework/task_2/Text1000times.txt");

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            for (int i = 1; i < 1000; i++) {
                fw.write("\n");
                fw.write("hey!Great news!");

                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
