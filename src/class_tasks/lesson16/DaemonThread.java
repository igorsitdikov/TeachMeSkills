package class_tasks.lesson16;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("I'm daemon");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
