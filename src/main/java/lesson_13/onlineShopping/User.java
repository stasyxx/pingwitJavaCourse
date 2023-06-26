package lesson_13.onlineShopping;

public class User {
    private String name;
    private int age;
    private Cart cart;
    public User(String name, int age, Cart cart){
        this.name = name;
        this.age = age;
        this.cart = cart;
    }
}
