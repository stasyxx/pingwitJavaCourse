package lesson_10.homework;
/*
Task 1
Есть Абстрактный класс Овощ (или интерфейс?) Надо сделать салат.
У каждого овоща есть граммовка и калорийность. Надо сделать салат и посчитать итоговое количество калорий и грамм.
 */
public abstract class Vegetable {
    private double calories;
    private double weight;

    public Vegetable(double calories, double weight) {
        this.calories = calories;
        this.weight = weight;
    }
    //этот метод не должен быть в овощах
    public abstract void salad();

    public double getCalories() {
        return calories;
    };
    public double getWeight() {
        return weight;
    }
}
