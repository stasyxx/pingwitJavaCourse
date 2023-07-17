package lesson_19.homework.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Task 1
Вход на вечеринку только по списку.
Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
после чего говорит может он пройти или нет
 */
public class PartyList {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Whitehouse");
        guestList.add("Depp");
        guestList.add("Evans");
        guestList.add("Holmes");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your surename: ");
        String userSurename = scanner.nextLine();

        if (guestList.contains(userSurename)) {
            System.out.println("Welcome, " + userSurename + "!");
        } else {
            System.out.println("Sorry, " + userSurename + ", but you're not on the guest list.");
        }
    }
}

