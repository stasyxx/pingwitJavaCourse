package lesson_9.homework.task3;
/*
Task 3*
Есть класс автомобиль. У автомобиля есть коробка передач и мотор.
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен

У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.

Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
Машина не может поехать, если не заведен мотор.
Когда машина едет, то пускай выведет на экран текущую скорость

Скорость = текущая_передача * 20

P.S. имена методов условные, ваши могут отличаться в названии.
Помните, что поля класса должны быть приватными
 */
public class Auto {
    private boolean engine;
    private int transmition;
    private int maxTransition = 7;
    private int minTransition = 0;
    public Auto(){
        this.engine = engine;
        this.transmition = transmition;
        this.maxTransition = maxTransition;
        this.minTransition = minTransition;
    };

}
