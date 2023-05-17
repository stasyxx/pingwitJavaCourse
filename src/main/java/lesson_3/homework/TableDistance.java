package lesson_3.homework;

public class TableDistance {
    /*
    Task 4
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
        public static void main (String[] args) {
            double inchToCm = 2.54;
            System.out.println("Table from inch to cm:");

            for (int inch = 1; inch <=20; inch++) {
                double cm;
                if (inch == 1) {
                    cm = inchToCm;
                } else {
                    cm = inch * inchToCm;
                }
                System.out.println("Inch " + inch + " = " + cm + " cm");
            }
        }
    }

