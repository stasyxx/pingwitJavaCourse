package lesson_14.homework.task_1;

import lesson_14.classwork.point_1.*;

public class LegoColorMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("", 5, LegoColor.PURPLE);
        LegoAnnotationService[] services = new LegoAnnotationService[]{
                new NotEmptyValidationService(),
                new SizeValidationService(),
                new ColorAnnotationValidationService()
        };
        for (LegoAnnotationService service : services) {
            ValidationResult result = service.validate(lego);
            System.out.println(result);
        }
    }
}
