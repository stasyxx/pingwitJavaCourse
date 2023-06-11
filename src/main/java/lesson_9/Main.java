package lesson_9;

public class Main {
    public static void main(String[] args) {
        Dell dell = new Dell();
        print(dell);
        Php php = new Php();
        print(php);
        Apple apple = new Apple();
        print(apple);
    }
    public static void print(Computer comp) {
        comp.turnOn();
        comp.turnOff();
        comp.reset();
    }
}
