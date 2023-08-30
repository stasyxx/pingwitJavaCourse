package lesson_14.homework.task_3;

import java.util.Scanner;
//+
public class Fight {
    private Gladiator userGladiator;
    private Gladiator opponentGladiator;

    public Fight(Gladiator userGladiator, Gladiator opponentGladiator) {
        this.userGladiator = userGladiator;
        this.opponentGladiator = opponentGladiator;
    }
    public void start() {
        System.out.println("A fight between " + userGladiator.getName() + " and " + opponentGladiator.getName() + " is starting!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready? (Press Enter to start fight)");
        scanner.nextLine();

        int round = 1;
        //такой цикл - нехорошая практика. Можно было переменные health завести и уже от этого отталкиваться, но ок!
        while (true) {
            System.out.println("Round " + round);

            System.out.println(userGladiator.getName() + ", choose attack number:");
            int playerAttack = scanner.nextInt();
            System.out.println(opponentGladiator.getName() + ", choose block...");
            BodyPart opponentBlock = opponentGladiator.defend();

            boolean playerHit = userGladiator.attack(opponentBlock);
            if (playerHit) {
                boolean opponentHit = opponentGladiator.attack(userGladiator.defend());
                if (opponentHit) {
                    System.out.println("Both gladiators have struck!");
                }
            }

            if (userGladiator.isDefeated()) {
                System.out.println(userGladiator.getName() + " failed!");
                break;
            } else if (opponentGladiator.isDefeated()) {
                System.out.println(opponentGladiator.getName() + " failed!");
                break;
            }

            round++;
        }
    }
}
