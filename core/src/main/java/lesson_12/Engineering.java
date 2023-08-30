package lesson_12;
/*
Task 1
Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.

 */
public class Engineering {
    public static void main(String[] args) {
        String engineering = "engineering";
        String engine = engineering.substring(0,6);
        String ring = engineering.substring(7);
        System.out.println(engine);
        System.out.println(ring);
    }


}
