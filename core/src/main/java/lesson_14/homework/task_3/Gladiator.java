package lesson_14.homework.task_3;
/*
Task 3(*)
Битва гладиаторов.
Давайте напишем простую консольную игру.
При запуске программа просит пользователя ввести имя - это будет прозвище гладиатора.
Затем программа случайным образом выбирает имя соперника из заранее заданного списка и выводит на экран сообщение,
что сейчас будет битва между [соперник_1] vs [соперник_2]

Далее программа спрашивает готов ли пользователь и после нажатия клавиши enter начинается бой.

Управление

Нападение:
1 - нанести удар в голову
2 - нанести удар в корпус
3 - нанести удар по ногам

Защита:
1 - поставить верхний блок
2 - поставить средний блок
3 - поставить нижний блок

Как проходит битва:
Пользователь выбирает номер удара, а компьютер случайным образом ставит блок, затем компьютер наносит ответный случайный удар,
а пользователь выбирает каким способом его отразить.

Игрок, который пропустил 4 удара проигрывает.
 */
//+
public class Gladiator {
    private String name;
    private static final int HEALTH = 4;
    private int missedAttacks;

    public Gladiator(String name) {
        this.name = name;
        this.missedAttacks = 0;
    }

    public String getName() {
        return name;
    }

    public boolean attack(BodyPart opponentBlock) {
        BodyPart attackType = BodyPart.values() [(int) (Math.random() * BodyPart.values().length)];
        if (attackType != opponentBlock) {
            System.out.println(name + " struck!" + attackType + "!");
            return true;
        } else {
            System.out.println(name + " missed!");
            missedAttacks++;
            return false;
        }
    }
    public BodyPart defend() {
        return BodyPart.values()[(int)(Math.random()* BodyPart.values().length)];
    }

    public boolean isDefeated() {
        return missedAttacks >= 4;
    }
}
