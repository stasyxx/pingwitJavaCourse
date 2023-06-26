package lesson_13.onlineShopping;
/*
Task 2
Создайте простой онлайн магазин используя ООП.
Есть класс абстрактный класс Product, который имеет поля name, price, quantity.
В магазине, например, есть 3 продукта: Apple (у него еще есть доп поле - цвет),
Computer(доп поля -  String processor, int ram), Coffee (+ String type).
Есть класс Cart который имеет методы addProduct, removeProduct, getTotalPrice, getTotalQuantity, printCart
Есть класс User который имеет поля name, age, cart.

Возможный пример вывода программы:
Vasya has 13 products in cart
Vasya has 1140.0 in cart
Cart contains:
Apple{color='red'} Product{name='Apple', price=10.0, quantity=5}
Apple{color='green'} Product{name='Apple', price=10.0, quantity=5}
Coffee{type='arabica'} Product{name='Coffee', price=20.0, quantity=1}
Coffee{type='robusta'} Product{name='Coffee', price=20.0, quantity=1}
Computer{processor='Intel', ram=16} Product{name='Computer', price=1000.0, quantity=1}
 */
public abstract class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
