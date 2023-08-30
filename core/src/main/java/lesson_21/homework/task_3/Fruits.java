package lesson_21.homework.task_3;

import java.util.Objects;

public class Fruits implements Comparable {
    private String name;
    private double kg;//weight
    private String type;//а почему бы не использовать enum?

    public Fruits(String name, double kg, String type) {
        this.name = name;
        this.kg = kg;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getKg() {
        return kg;
    }
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return Double.compare(fruits.kg, kg) == 0 && Objects.equals(name, fruits.name) && Objects.equals(type, fruits.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kg, type);
    }

    @Override
    public int compareTo(Object o) {
        return 0;//они у тебя все равны всегда? Это то, что ты действительно хочешь?
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", kg=" + kg +
                ", type='" + type + '\'' +
                '}';
    }
}
