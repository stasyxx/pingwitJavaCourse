package lesson_21.homework.task_2;

public record Student(String name, String surname, int age) implements Comparable {


    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return name + surname;
    }
// не до конца разобралась с поочередностью и условиями сортировки вот здесь
    @Override
    public int compareTo(Object students) {
        Student list = (Student) students;
        int age = name.compareTo(list.name());
        if (age != 0) {
            return age;
        }
        return age;
    }
}
