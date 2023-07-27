package lesson_21.homework.task_1;

import java.util.TreeSet;
/*
Task 1
Есть TreeSet чисел, нужно отсортировать его в обратном порядке
 */
/*не совсем. вместо создания 2-й коллекции, можно использовать Comparator:
1) Comparator<Object> reversedComparator = Collections.reverseOrder(); Set<Integer> treeReversed = new TreeSet<>(reversedComparator);
*/
public class ReverseSortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeAdd = new TreeSet<>();
        TreeSet<Integer> treeReverse = new TreeSet<>();

        treeAdd.add(19);
        treeAdd.add(4);
        treeAdd.add(73);
        treeAdd.add(2);
        treeAdd.add(34);
        treeAdd.add(10);
        treeAdd.add(61);


        treeReverse = (TreeSet)treeAdd.descendingSet();
        System.out.println(treeReverse);
    }
}
