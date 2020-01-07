package lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.IHand;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
