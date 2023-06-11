package lesson_9.homework.task2;

import java.util.Arrays;

public class CatalogueOfHouses {
    public TypeOfHouses[] houses;

    public CatalogueOfHouses(TypeOfHouses[] houses) {
        this.houses = houses;
    }

    public TypeOfHouses[] getHouses() {
        return houses.clone();
    }

    @Override
    public String toString() {
        return "Urban high-rise building = " + Arrays.toString(new TypeOfHouses[]{houses[0]}) + " " + "Countryside house = " + Arrays.toString(new TypeOfHouses[]{houses[1]});
    }
}

