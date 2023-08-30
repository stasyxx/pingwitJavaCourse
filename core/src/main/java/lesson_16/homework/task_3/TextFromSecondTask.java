package lesson_16.homework.task_3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
Task 3
Прочитать файл из Task_2 и вывести на экран содержимое
 */
//+, форматируй!
public class TextFromSecondTask {
    private static final String FILE_PATH = "src/main/java/lesson_16/homework/task_2/Text1000times.txt";//название файла с маленькой буквы
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH); BufferedInputStream bis = new BufferedInputStream(fis)) {
            int data;
            while((data = fis.read()) != -1){
            System.out.print((char) data);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
