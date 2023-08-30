package lesson_9;

public class Dell implements Computer{


    @Override
    public void turnOn() {
        System.out.println("Dell is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Dell is off");
    }

    @Override
    public void reset() {
        System.out.println("Dell is reseting");
    }
}
