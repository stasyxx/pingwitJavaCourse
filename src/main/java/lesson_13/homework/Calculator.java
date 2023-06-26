package lesson_13.homework;

/*
Task 1
Создайте калькулятор используя ООП.
Есть Calculator c методом

    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }

и отдельные классы для каждой математической операции (Addition, Subtraction, Multiplication, and Division).
Каждый класс должен иметь метод calculate() который принимает два числа и возвращает результат.
 */
public class Calculator {
    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }

    public static void main(String[] args) {
        double resultDivision = new Calculator().calculate(20,4, new Division());
        System.out.println(resultDivision);
        double resultMultiplication = new Calculator().calculate(4,5, new Multiplication());
        System.out.println(resultMultiplication);
        double resultSubstraction = new Calculator().calculate(3,1, new Subtraction());
        System.out.println(resultSubstraction);
        double resultAddition = new Calculator().calculate(2,5, new Addition());
        System.out.println(resultAddition);
    }
}
