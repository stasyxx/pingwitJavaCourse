package lesson_2.homework;

public class les_2_homework {
    public static void main(String[] args) {
        System.out.println("  Hello, Liza! " + "This is my homework: ");

        byte num1 = 16;
        byte num2 = 29;
        byte sumOfBytes = (byte) (num1 + num2);
        System.out.println("Sum = " + sumOfBytes);

        double num3 = 121.2;
        double num4 = num1;
        double multOfDoubles = num3 * num4;
        System.out.println("Multiplication = " + multOfDoubles);

        float num5 = 3.14f;
        float num6 = (float) num3;
        double divOfFloats = num3 % num5;
        System.out.println("Division = " + divOfFloats);
        int divOfFloats2 = (int) divOfFloats;
        System.out.println("or divison = " + divOfFloats2);

        int num7 = num1;
        float num8 = num5;
        float sumOfIntAndFl = num1 + num5;
        int sumOfIntAndFl2 = (int) (num1 + num5);
        System.out.println("Sum of two numbers is " + sumOfIntAndFl + " or " + sumOfIntAndFl2 + ".");

        System.out.println("  Thank you! Have a nice day!:) ");
    }
}
