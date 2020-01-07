package lesson_interfaces.task2.shoes;

import lesson_interfaces.task2.jacket.IJacket;

public class RiekerShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Rieker");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Rieker");
    }
}
