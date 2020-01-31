package class_tasks.lesson16;

public class SleeperThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Good morning! I'm awake.");
            } else {
                System.out.println("Damn, neighbors, again. I'm awake.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
