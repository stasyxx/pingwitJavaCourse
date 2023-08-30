package lesson_6.homework;

import lesson_6.practice.Person;

public class HelloFromStatic {
    public static void main(String[] args) {
        Person.text = "Hello from static";
        Person nick = new Person("Nick", (byte) 23);
        System.out.println(nick);
        Person sara = new Person("Sara", (byte) 34);
        System.out.println(sara);
        Person eugene = new Person("Eugene", (byte) 10);
        System.out.println(eugene);
        Person jack = new Person("Jack", (byte) 47);
        System.out.println(jack);

    }
}
