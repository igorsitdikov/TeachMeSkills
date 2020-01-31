package class_tasks.lesson16;

import java.util.Random;

public class PersonThreadIsAlive extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int rand = random.nextInt(6);
            if (rand == 1) {
                interrupt();
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
