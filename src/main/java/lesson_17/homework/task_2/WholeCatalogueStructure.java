package lesson_17.homework.task_2;
/*
Task 2
Написать функцию, которая бы обходила весь каталог (включая вложенные папки и файлы) и печатала бы на экран структуру.
Это может быть папка с вашим проектом
 */
import java.io.File;

public class WholeCatalogueStructure {
    private static final String PATH = "D:\\!Java Course\\Homework 1";

    public static void main(String[] args) {
        File folder = new File(PATH);
        listOfFiles(folder);
    }

    public static void listOfFiles(File folder) {
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile()) {
                System.out.println("File: " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("Folder: " + file.getName());
                listOfFiles(file);
            }
        }
    }
}
