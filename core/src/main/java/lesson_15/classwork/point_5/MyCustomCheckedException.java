package lesson_15.classwork.point_5;

public class MyCustomCheckedException extends Exception{

    public MyCustomCheckedException() {
    }

    public MyCustomCheckedException(String message) {
        super(message);
    }
}
