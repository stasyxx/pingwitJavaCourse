package lesson_10.homework;

public abstract class Vegetable {
    private double calories;
    private double weight;

    public Vegetable(double calories, double weight) {
        this.calories = calories;
        this.weight = weight;
    }

    public abstract void salad();

    public double getCalories() {
        return calories;
    };
    public double getWeight() {
        return weight;
    }
}