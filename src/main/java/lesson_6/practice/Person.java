package lesson_6.practice;
/*
Task 2
Создайте класс, у которого будут поля имя и возраст.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.
 */
public class Person {
    String name;
    byte age;
    public static String text = "Hello from static";
    public Person(String name, byte age) {
        this.name = name;
        this.age = age;

    }
    public Person() {
        this.name = "Default";
        this.age = 10;
    }
    {
        System.out.println("Hello, I have created new class element");
    }
    static {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", age = " + age +
                '}';
    }

}
