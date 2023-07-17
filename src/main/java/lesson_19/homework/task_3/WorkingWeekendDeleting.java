package lesson_19.homework.task_3;

import java.util.ArrayList;
import java.util.List;

/*
Task 3
Есть две коллекции, нужно удалить из первой те, которые есть во второй
 */
public class WorkingWeekendDeleting {
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

        employeeListSat.removeAll(employeeListSun);
        System.out.println("List of people after deleting: " + employeeListSat);

    }
}