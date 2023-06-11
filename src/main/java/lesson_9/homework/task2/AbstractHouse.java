package lesson_9.homework.task2;
/*
Task 2(abstract class)
Есть два типа домов - городская многоэтажка и загородный дом.
У каждого типа дома есть методы "получить кол-во этажей", "включить отопление",
"получить кол-во жильцов".
Есть каталог домов (например класс, внутри которого какой-то массив).
Создайте каталог и поместите туда несколько домов.
 */
public abstract class AbstractHouse{
private String typeOfHouses;
public AbstractHouse(String typeOfHouses){
    this.typeOfHouses = typeOfHouses;
}
public abstract int getFloorNumber();
public abstract void turnOnHiting();
public abstract int getResidentsNumber();

}
