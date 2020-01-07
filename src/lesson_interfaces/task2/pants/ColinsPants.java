package lesson_interfaces.task2.pants;

import lesson_interfaces.task2.jacket.IJacket;

public class ColinsPants implements IPants {

    @Override
    public void putOn() {
        System.out.println("Надел штаны Colin's");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Colin's");
    }
}
