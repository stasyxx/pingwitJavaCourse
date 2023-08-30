package lesson_11.homework;

import java.lang.reflect.Method;

/*
Task 2
Создайте какой-нибудь класс и сделайте в нем приватный метод, который будет что-нибудь печатать на экран.
В другом классе с методом main() при помощи рефлексии вызовите этот приватный метод.
 */
public class SecretClass {

    public void print(){
        System.out.println("Secreeeetttt");
    }
}
