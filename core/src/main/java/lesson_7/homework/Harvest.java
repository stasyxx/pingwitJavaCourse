package lesson_7.homework;

import java.math.BigDecimal;

/*
Task 1
Создайте класс Harvest, в котором будут храниться данные об урожае на ферме.
У Harvest есть поля
Long id - уникальный идентификатор
String field - название поля, с которого был собран урожай (урожаев за год может быть несколько собрано с одного поля)
String plant - название растения (рожь, пшеница, клубника, картошечка и т.д.)
BigDecimal weight - вес собранного урожая

Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей

Создайте класс HarvestStatisticService, добавьте классу метод, который будет получать аргументом массив Harvest[],
а возвращать массив HarvestStatistic[] с посчитанной статистикой.

Внутри метода посчитайте статистику для каждого растения:
- общий вес урожая для каждого растения
 */
public class Harvest {
    private int longId;
    private String field;
    private String plant;
    private BigDecimal weight;
}
