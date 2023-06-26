package lesson_13.onlineShopping;

public class Apple extends Product {
    private String color;
    public Apple(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }
}
