package lesson_25.classwork.point_2;


import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class ApacheFileUtilsExample {

    private static final String FILE_PATH = "src/main/java/lesson_25/classwork/point_2/eminem_lose_yourself.txt";
    private static final String FILE_PATH_TO_CREATE = "src/main/java/lesson_25/classwork/point_2/create.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        List<String> lines = FileUtils.readLines(file);

        lines.forEach(System.out::println);

        File fileToCreate = new File(FILE_PATH_TO_CREATE);
        FileUtils.touch(fileToCreate);
    }
}
