package lesson_interfaces.task3.model;

import lesson_interfaces.task3.interfaces.IStart;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean check() {
        Random random = new Random();
        int checkNum = random.nextInt(11);
        return checkNum > 3;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шатла запущены. " +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
