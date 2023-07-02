package lesson_14.homework.task_1;

import lesson_14.classwork.point_1.Lego;
import lesson_14.classwork.point_1.LegoAnnotationService;
import lesson_14.classwork.point_1.ValidationResult;

import java.lang.reflect.Field;

public class ColorAnnotationValidationService implements LegoAnnotationService {

    @Override
    public ValidationResult validate(Lego lego) throws IllegalAccessException {
        Field[] declaredFields = lego.getClass().getDeclaredFields();
        ValidationResult validationResult = new ValidationResult(true, "Ok");
        for (Field field : declaredFields) {
            ValidColor annotation = field.getAnnotation(ValidColor.class);
            if(annotation != null ){
                field.setAccessible(true);
                Object value = field.get(lego);
                if(value instanceof LegoColor){
                   LegoColor fieldValue = (LegoColor) value;
                   LegoColor[] colors = annotation.colors();
                    for (LegoColor color: colors) {
                        if(fieldValue == color) {
                            validationResult = new ValidationResult(false, field.getName() + " is invalid");
                            break;

                        }
                    };

                }
            }
        }
        return validationResult;
    }
}
