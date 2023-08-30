package lesson_14.classwork.point_1;

import lesson_14.homework.task_1.LegoColor;

public class LegoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("type", 3, LegoColor.YELLOW);
        LegoAnnotationService[] services = new LegoAnnotationService[] {
                new NotEmptyValidationService(),
                new SizeValidationService()
        };

        for (LegoAnnotationService service : services) {
            ValidationResult result = service.validate(lego);
            System.out.println(result);
        }
    }
}
