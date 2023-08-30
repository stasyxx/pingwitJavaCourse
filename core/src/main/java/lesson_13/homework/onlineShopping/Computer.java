package lesson_13.homework.onlineShopping;

public class Computer extends Product {
    private String processor;
    private int ram;
    public Computer(String name, double price, int quantity, String processor, int ram) {
        super(name, price, quantity);
        this.processor = processor;
        this.ram = ram;
    }
}
