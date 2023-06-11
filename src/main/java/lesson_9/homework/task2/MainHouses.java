package lesson_9.homework.task2;

public class MainHouses {
    public static void main(String[] args) {

        TypeOfHouses[] houses = {
            new TypeOfHouses("urban high-rise building", 11, 460),
            new TypeOfHouses("countryside house", 2, 4)
        };

        CatalogueOfHouses catalogue = new CatalogueOfHouses(houses);
        System.out.println(catalogue);
    }

}
