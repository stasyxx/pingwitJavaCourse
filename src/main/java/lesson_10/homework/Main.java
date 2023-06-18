package lesson_10.homework;

public class Main {
    public static void main(String[] args) {
        Vegetable[] vegetables = {
                new Cucumber(134,205),
                new Redish(78,140),
                new SourCream(95,45)
        };
        Salad salad = new Salad(vegetables);
        salad.makeSalad();
    }
}
