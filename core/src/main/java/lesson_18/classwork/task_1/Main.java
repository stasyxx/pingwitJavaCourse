package lesson_18.classwork.task_1;

public class Main {
    public static void main(String[] args) {
        NaturalNumber<Integer> number = new NaturalNumber<>(10);
        NaturalNumber<Integer> number2 = new NaturalNumber<>(-12);
        System.out.println(number.isNatural());
        System.out.println(number2.isNatural());

    }
}
