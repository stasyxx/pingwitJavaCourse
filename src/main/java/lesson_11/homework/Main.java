package lesson_11.homework;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SecretLocker passcode = new SecretLocker("123");
        System.out.println(passcode);
        Class<SecretLocker> secretLockerClass = SecretLocker.class;
        Field field = secretLockerClass.getDeclaredField("passcode");
        field.setAccessible(true);
        field.set(passcode, "321");
        System.out.println(passcode);
    }

}
