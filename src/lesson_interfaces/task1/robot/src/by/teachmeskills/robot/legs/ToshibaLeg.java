package lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.IHand;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
