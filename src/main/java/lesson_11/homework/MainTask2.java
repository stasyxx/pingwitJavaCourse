package lesson_11.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTask2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SecretClass secretClass = new SecretClass();
        Class<SecretClass> secretClassClass = SecretClass.class;
        Method method = secretClassClass.getDeclaredMethod("print");
        method.setAccessible(true);
        method.invoke(secretClass);
    }
}
