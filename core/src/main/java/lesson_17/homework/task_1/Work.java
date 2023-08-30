package lesson_17.homework.task_1;

import java.io.Serial;
import java.io.Serializable;

public class Work implements Serializable {
    private String name;
    private int exp;

    public Work(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
