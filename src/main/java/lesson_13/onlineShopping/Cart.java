package lesson_13.onlineShopping;

public class Cart {

    public User(String name, int age, Cart cart){
        this.name = name;
        this.age = age;
        this.cart = cart;
    }
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }
}
