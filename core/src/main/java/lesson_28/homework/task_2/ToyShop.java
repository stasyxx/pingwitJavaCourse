package lesson_28.homework.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToyShop {
    private int quantity;
    private List<Toy> toys;

    public ToyShop(int quantity, List<Toy> toys) {
        this.quantity = 0;
        this.toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
        this.quantity += 1;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToyShop toyShop = (ToyShop) o;
        return quantity == toyShop.quantity && Objects.equals(toys, toyShop.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, toys);
    }

    @Override
    public String toString() {
        return "ToyShop{" +
                "quantity=" + quantity +
                ", toys=" + toys +
                '}';
    }
}
