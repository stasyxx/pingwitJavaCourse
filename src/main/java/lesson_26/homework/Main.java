package lesson_26.homework;
/*1.прочитать файлы с помощью ридера по аналогии в уроке, в отдельный методб каждый файл отдельно
 2.обджекты, которые достали, поместить в коллекцию
 3.отсортировать с помощью стрима по фамилии и имени
 4.записать отсортированные объекты в джсон
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    private static final String FILE_PATH_JACK = "src/main/resources/lesson_26/studentJack.json";
    private static final String FILE_PATH_BARRY = "src/main/resources/lesson_26/studentBarry.json";
    private static final String FILE_PATH_HOLLY = "src/main/resources/lesson_26/studentHolly.json";
    private static final String FILE_PATH_SORTED_GROUP = "src/main/resources/lesson_26/sortedGroup.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Student jack = readStudentFile(objectMapper, FILE_PATH_JACK);
        Student barry = readStudentFile(objectMapper, FILE_PATH_BARRY);
        Student holly = readStudentFile(objectMapper, FILE_PATH_HOLLY);
        List<Student> group = Arrays.asList(jack, barry, holly);

        List<Student> sortedGroup = sortGroup(group);

        File file = new File(FILE_PATH_SORTED_GROUP);
        objectMapper.writeValue(file, sortedGroup);
    }

    public static Student readStudentFile(ObjectMapper objectMapper, String path) throws IOException {
        InputStream resource = ClassLoader.getSystemResourceAsStream(path);
        Student student = objectMapper.readValue(resource, Student.class);
        return student;
    }

    public static List<Student> sortGroup(List<Student> group) {
        List<Student> sortedGroup = group.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(Collectors.toList());
        return sortedGroup;
    }
}
