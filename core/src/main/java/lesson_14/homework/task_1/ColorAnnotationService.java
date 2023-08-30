package lesson_14.homework.task_1;
/*
Task 1
Доделать валидаторы:
1)	Добавить поле LegoColor (BLUE, GREEN, YELLOW,ORANGE…)color.
2)	Создать аннотацию @ValidColor, которая будет проверять, что пользователь не ввел цвета из массива LegoColor[] colors = {BLUE, GREEN}
3)	ColorAnnotationValidationService
 */

import lesson_14.classwork.point_1.Lego;
import lesson_14.classwork.point_1.ValidationResult;

public interface ColorAnnotationService {
    ValidationResult validate(Lego lego) throws IllegalAccessException;
}
