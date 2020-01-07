package lesson_interfaces.task2.pants;

import lesson_interfaces.task2.jacket.IJacket;

public class OstinPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Ostin");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Ostin");
    }
}
