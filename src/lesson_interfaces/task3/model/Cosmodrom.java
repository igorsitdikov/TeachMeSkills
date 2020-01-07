package lesson_interfaces.task3.model;

import lesson_interfaces.task3.interfaces.IStart;

public class Cosmodrom {
    public void start(IStart start) throws InterruptedException {
        if (!start.check()){
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.engineStarting();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            start.start();
        }
    }
}
