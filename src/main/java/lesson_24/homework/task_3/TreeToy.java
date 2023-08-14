package lesson_24.homework.task_3;

import java.util.Objects;
//можно было record сделать
public class TreeToy {
    private String name;
    private boolean hasRope;

    public TreeToy(String name, boolean hasRope) {
        this.name = name;
        this.hasRope = hasRope;
    }

     public String getName() {
        return name;
     }

     public boolean isHasRope() {
        return hasRope;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeToy treeToy = (TreeToy) o;
        return hasRope == treeToy.hasRope && Objects.equals(name, treeToy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasRope);
    }

    @Override
    public String toString() {
        return "TreeToy{" +
                "name='" + name + '\'' +
                ", hasRope=" + hasRope +
                '}';
    }
}
