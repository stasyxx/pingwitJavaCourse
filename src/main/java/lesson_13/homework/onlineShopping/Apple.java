package lesson_13.homework.onlineShopping;

public class Apple extends Product {
    private String color;
    public Apple(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }
}
