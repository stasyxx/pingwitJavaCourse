package lesson_26.homework;
/*
Task 1
Есть студенты. Каждый студент записан в отдельном .json файле.
У каждого студента есть номер группы, имя, фамилия и список любимых предметов для изучения.
Прочитать студентов при помощи Jackson JSON парсера.

Затем необходимо отсортировать студентов по фамилии и имени и записать отсортированный список в файл.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private String name;
    private String surname;
    private int groupNum;
    private Contact contactInfo;
//лишние пустые строки
    private List<Subject> favSubjects;

    public Student(String name, String surname, int groupNum, Contact contactInfo, List<Subject> favSubjects) {
        this.name = name;
        this.surname = surname;
        this.groupNum = groupNum;
        this.contactInfo = contactInfo;
        this.favSubjects = favSubjects;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public List<Subject> getFavSubjects() {
        return favSubjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setFavSubjects(List<Subject> favSubjects) {
        this.favSubjects = favSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNum == student.groupNum && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(contactInfo, student.contactInfo) && Objects.equals(favSubjects, student.favSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, groupNum, contactInfo, favSubjects);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNum=" + groupNum +
                ", contactInfo=" + contactInfo +
                ", favSubjects=" + favSubjects +
                '}';
    }
}
