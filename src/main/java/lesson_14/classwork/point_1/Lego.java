package lesson_14.classwork.point_1;

import lesson_14.homework.task_1.LegoColor;
import lesson_14.homework.task_1.ValidColor;

public class Lego {
    @NotEmpty
    private String type;
    @Size(min = 2, max = 11)
    private Integer elementsQuantity;
    @ValidColor(colors = {LegoColor.BLUE, LegoColor.GREEN})
    private LegoColor color;

    public Lego(String type, Integer elementsQuantity, LegoColor color) {
        this.type = type;
        this.elementsQuantity = elementsQuantity;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public Integer getElementsQuantity() {
        return elementsQuantity;
    }
    public Enum getColor() { return color; };
}
