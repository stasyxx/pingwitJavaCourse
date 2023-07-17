package lesson_18.homework.task_1;

public class Main {
    public static void main(String[] args) {
        UnknownArgument<String> arg = new UnknownArgument<>("something");
        System.out.println(arg.getArgType());
    }
}
