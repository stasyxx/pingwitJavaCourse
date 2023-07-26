package lesson_21.homework.task_2;

import java.util.Iterator;
import java.util.TreeSet;
/*
Task 2
Есть TreeSet<Student>. Заполните его списком студентов. Если получили исключение, вспомните про интерфейс Comparable или Comparator.
 */

public class ListOfStudents {
    public static void main(String[] args) {

        TreeSet<Student> listOfStudents = new TreeSet<>();
        listOfStudents.add(new Student("Lucy ", "Howell", 21));
        listOfStudents.add(new Student("Andy ", "Biersak", 29));
        listOfStudents.add(new Student("Caroline ", "Forbes", 23));
        listOfStudents.add(new Student("Caroline ", "Hall", 19));
        listOfStudents.add(new Student("Eliza ", "Drake", 30));
        Iterator<Student> i = listOfStudents.iterator();
        while(i.hasNext())
            System.out.println(i.next());

       // for (Student comparing: listOfStudents) {
       //     System.out.println(comparing.toString());
        }

    }

