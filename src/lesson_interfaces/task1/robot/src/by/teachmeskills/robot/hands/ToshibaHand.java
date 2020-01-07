package lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.IHead;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
