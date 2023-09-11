package lesson_27.homework.task_1;

import java.util.List;
import java.util.Objects;

/*
Task 1
Есть студенты. У каждого студента есть номер группы, имя, фамилия, факультет. Создать XML файл, в котором описать 3-4 студента.
Десериализовать студентов из файла любым способом.
 */
public class Student {

    private int groupNum;
    private String name;
    private String surname;
    private List<Faculty> faculty;

    public Student(int groupNum, String name, String surname, List<Faculty> faculty) {
        this.groupNum = groupNum;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }

    public void setFaculty(List<Faculty> faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNum == student.groupNum && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNum, name, surname, faculty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNum=" + groupNum +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
