package lesson_20.classwork.point_0;

import java.util.ArrayList;
import java.util.List;

public class IteratorRemove {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();

        collection.add("Java");
        collection.add("Python");
        collection.add("Java");

        for (String elem: collection) {
            collection.remove(elem);
        }
        System.out.println(collection);
    }
}
