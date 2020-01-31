package class_tasks.lesson16;

import java.util.Random;

public class PersonThread implements Runnable {
    static int numberAlive = 0;

    public PersonThread() {
        numberAlive++;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int rand = random.nextInt(6);
            if (rand == 1) {
                numberAlive--;
                Thread.currentThread().interrupt();
                System.out.println("Количество живых : " + numberAlive);
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
