package lesson_9;

public class Php implements Computer {

    @Override
    public void turnOn() {
        System.out.println("Php is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Php is off");
    }

    @Override
    public void reset() {
        System.out.println("Php is reseting");
    }
}
