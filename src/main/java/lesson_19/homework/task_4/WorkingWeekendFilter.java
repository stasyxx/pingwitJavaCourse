package lesson_19.homework.task_4;

import java.util.ArrayList;
import java.util.List;

/*
Task 4
Есть две коллекции, нужно оставить в первой только те, которые есть во второй
 */
public class WorkingWeekendFilter {
    public static void main(String[] args) {

        List<String> employeeListSat = new ArrayList<>();
        employeeListSat.add("Sara");
        employeeListSat.add("Conor");
        employeeListSat.add("Max");
        employeeListSat.add("Daisy");
        employeeListSat.add("Evan");
        System.out.println("List of people on Saturday: " + employeeListSat);

        List<String> employeeListSun = new ArrayList<>();
        employeeListSun.add("Erik");
        employeeListSun.add("Conor");
        employeeListSun.add("Lucy");
        employeeListSun.add("Helen");
        employeeListSun.add("Evan");
        System.out.println("List of people on Sunday: " + employeeListSun);

        List<String> commonList = new ArrayList<>();
        for (String employee : employeeListSat) {
            if (employeeListSun.contains(employee)) {
                commonList.add(employee);
            }
        }
        employeeListSat = commonList;
        System.out.println("List of people after filtering: " + employeeListSat);

    }

}
