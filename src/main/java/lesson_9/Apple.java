package lesson_9;

public class Apple implements Computer{
    @Override
    public void turnOn() {
        System.out.println("Apple is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple is off");
    }

    @Override
    public void reset() {
        System.out.println("Apple is reseting");
    }
}
