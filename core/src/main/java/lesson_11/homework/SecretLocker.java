package lesson_11.homework;
/*
Task 1
Создайте класс SecretLocker. Добавьте в класс поле:
private final String passcode;

Добавьте метод, который будет возвращать значение passcode.
Создайте экземпляр класса SecretLocker. При помощи рефлексии поменяйте passcode у созданного объекта.
Выведите на экран объект класса SecretLocker до и после замены passcode.
 */
public class SecretLocker {
    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    public String getPasscode() {
        return passcode;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "passcode ='" + passcode + '\'' +
                '}';
    }
}
