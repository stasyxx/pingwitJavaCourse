package lesson_10.homework;

public class Salad {
    private Vegetable[] vegetables;
    private double sumOfCalories;
    private double sumOfWeight;
    public Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }
    public void makeSalad() {
        for (int i = 0; i < vegetables.length; i++) {
            sumOfCalories += vegetables[i].getCalories();
            sumOfWeight += vegetables[i].getWeight();
        }
        System.out.println("Sum of calories in cucumber, redish and sour cream salad: " + sumOfCalories);
        System.out.println("Sum of weight of cucumber, redish and sour cream salad: " + sumOfWeight);
    }
}
