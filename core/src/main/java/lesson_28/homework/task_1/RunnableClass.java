package lesson_28.homework.task_1;

public class RunnableClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
