package lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.IHead;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand() {
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
