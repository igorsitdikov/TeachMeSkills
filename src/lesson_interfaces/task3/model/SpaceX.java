package lesson_interfaces.task3.model;

import lesson_interfaces.task3.interfaces.IStart;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean check() {
        Random random = new Random();
        int first = random.nextInt(11);
        int second = random.nextInt(11);
        return first < second;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели SpaceX запущены. " +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
