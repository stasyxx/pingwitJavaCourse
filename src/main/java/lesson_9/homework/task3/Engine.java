package lesson_9.homework.task3;
//Подразумевалось, что это полноценный класс с полями, конструктором
public class Engine {
    //что значит 'boolean engine'? Может isEngineOn? У тебя метод возвращает String в сигнатуре, а логика void.
    private String turnOnEngine(boolean engine) {
        if (engine = true) {
            System.out.println("You can't turn On the engine, because it is already On");
        } else {
            System.out.println("Turning on the engine");
        };
    };
    //что значит 'boolean engine'? У тебя метод возвращает String в сигнатуре, а логика void.
    private String turnOffEngine(boolean engine) {
        if (engine = false) {
                System.out.println("You can't turn Off the engine, because it is already Off");
            } else {
            System.out.println("Turning off the engine");
        }

    };
}
