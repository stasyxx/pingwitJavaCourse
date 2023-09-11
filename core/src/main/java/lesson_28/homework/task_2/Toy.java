package lesson_28.homework.task_2;

import java.util.Objects;

/*
Task 2
Есть магазин игрушек, в который несколько поставщиков (потоков) доставляют товар. Вам необходимо доставить в магазин игрушки
(например 100 от одного поставщика и 50 от другого и затем вывести на экран все игрушки, которые сейчас в магазине
 */
public class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
