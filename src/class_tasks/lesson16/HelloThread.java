package class_tasks.lesson16;

public class HelloThread implements Runnable {

    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Hello, I am thread with ID = " + id + ", name = " + name + "");
    }
}
