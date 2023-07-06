package lesson_16.homework.task_1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
Task 1
Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
 */
public class ArrayOutput {
    private static final String PATH = "src/main/java/lesson_16/homework/arrayOutputFile.txt";

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try (FileOutputStream fos = new FileOutputStream(PATH);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            String textArray = Arrays.toString(array);
            bos.write(textArray.getBytes());

            bos.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
