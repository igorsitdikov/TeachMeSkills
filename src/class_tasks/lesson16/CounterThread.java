package class_tasks.lesson16;

public class CounterThread implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            counter++;
            if (counter % 1000 == 0){
                if (Thread.currentThread().isInterrupted()){
                    System.out.println(counter);
                    break;
                }
            }
        }

    }
}
