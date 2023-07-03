package lesson_14.homework.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Gladiator's name: ");
        String userGladiatorName = scanner.nextLine();

        Gladiator userGladiator = new Gladiator(userGladiatorName);
        Gladiator opponentGladiator = new Gladiator("Opponent Gladiator");

        Fight fight = new Fight(userGladiator, opponentGladiator);
        fight.start();
    }
}
