package lesson_16.homework.task_4;
/*
Task 4
Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран
 */

import java.io.*;

public class SecretMessage {
    private static final String FILE_PATH = "src/main/java/lesson_16/homework/task_4/4s1_JuRmFUs.jpg";

    public static void main(String[] args) {
        writeSecretMess(FILE_PATH);
        readSecretMess(FILE_PATH);
    }
    public static void writeSecretMess(String message){
        try (FileWriter fw = new FileWriter(message, true)) {
            fw.write("\n");
            fw.write("Can you see it?");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readSecretMess(String message) {
        try (BufferedReader br = new BufferedReader(new FileReader(message))) {
            String line;
            while ((line = br.readLine()) != null){
                if(line.equals("Can you see it?")) {//строка будет и так последней, ибо у тебя append = true у FileWriter, т.е equals
                    //необязательно.
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
