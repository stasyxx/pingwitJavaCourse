package lesson_24.homework.task_4;

import lesson_24.homework.task_3.TreeToy;

import java.util.ArrayList;
import java.util.List;

public class UniqueToys {
    public static void main(String[] args) {

        List<TreeToy> toyList = new ArrayList<>();
        toyList.add(new TreeToy("Ball", true));
        toyList.add(new TreeToy("Star", false));
        toyList.add(new TreeToy("Star", false));
        toyList.add(new TreeToy("Angel", true));
        toyList.add(new TreeToy("Star", false));
        toyList.add(new TreeToy("Candy", false));
        toyList.add(new TreeToy("Ribbon", false));
        toyList.add(new TreeToy("Candy", false));

        Long distinctToys = toyList.stream()
                .distinct()
                .count();
        System.out.println("Number of tree toys in this list is " + toyList.size());
        System.out.println("In this toy tree list are " + distinctToys + " distinct toys");
    }
}