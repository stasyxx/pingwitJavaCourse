package lesson_24.homework.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Task 3
Есть коллекция елочных игрушек, надо узнать у всех ли игрушек есть крепеж на елку.
 */
public class TreeToyWithWithoutRope {
    public static void main(String[] args) {

        List<TreeToy> toyList = new ArrayList<>();
        toyList.add(new TreeToy("Ball", true));
        toyList.add(new TreeToy("Star", false));
        toyList.add(new TreeToy("Angel", true));
        toyList.add(new TreeToy("Candy", false));
        toyList.add(new TreeToy("Ribbon", false));

        for (TreeToy toy : toyList) {
            if (toy.isHasRope()) {
                System.out.println(toy.getName() + " has a hook for the tree.");
            } else {
                System.out.println(toy.getName() + " doesn't have a hook for the tree.");
            }
        }
    }

}



