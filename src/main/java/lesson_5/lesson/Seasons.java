package lesson_5.lesson;

import java.util.Arrays;

public class Seasons {
    public static void main(String[] args) {
        //0,1,2,3
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println(seasons[0]);
        System.out.println(seasons[seasons.length - 1]);

        System.out.println(seasons);
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println(Arrays.toString(seasons));
    }
}
