package lesson_9.homework.task2;

public class TypeOfHouses extends AbstractHouse{
    private int floorNumber;
    private int residentsNumber;


    public TypeOfHouses(String typeOfHouses, int floorNumber, int residentsNumber) {
        super(typeOfHouses);
        this.floorNumber = floorNumber;
        this.residentsNumber = residentsNumber;
    }

    @Override
    public int getFloorNumber() {
        return floorNumber;
    }

    @Override
    public void turnOnHiting() {
        System.out.println("Hiting is On");
    }

    @Override
    public int getResidentsNumber() {
        return residentsNumber;
    }

    @Override
    public String toString() {
        return
                "Floor number = " + floorNumber +
                        ", residents number = " + residentsNumber + ", hiting is On.";
    }

}
