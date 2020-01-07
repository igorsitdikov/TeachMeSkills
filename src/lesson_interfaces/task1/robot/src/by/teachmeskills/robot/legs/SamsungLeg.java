package lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.IHand;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
