package lesson_13.homework.onlineShopping;

public class Coffee extends Product{
    private String type;
    public Coffee(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }
}
