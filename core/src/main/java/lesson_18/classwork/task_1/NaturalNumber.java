package lesson_18.classwork.task_1;

public class NaturalNumber<T extends Integer> {
    private T number;

    public boolean isNatural() {
        boolean isNatural = false;
        if (this.number.intValue() > 0) {
            isNatural = true;
        }
        return isNatural;
    }

    public NaturalNumber(T number) {
        this.number = number;
    }
}
