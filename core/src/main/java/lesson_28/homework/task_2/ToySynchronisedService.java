package lesson_28.homework.task_2;

public class ToySynchronisedService {
        public synchronized void addToy(ToyShop toyShop){
            toyShop.addToy(new Toy("Toy"));
        }
    }

