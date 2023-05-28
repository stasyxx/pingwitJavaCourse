package lesson_6.practice;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        Person dasha = new Person("Dasha", (byte) 26);
        System.out.println(person);
        System.out.println(dasha);
    }
}
