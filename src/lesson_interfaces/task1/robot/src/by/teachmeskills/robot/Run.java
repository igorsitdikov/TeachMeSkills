package lesson_interfaces.task1.robot.src.by.teachmeskills.robot;

import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.IHand;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.SamsungHand;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.SonyHand;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.hands.ToshibaHand;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.IHead;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.SamsungHead;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.SonyHead;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.heads.ToshibaHead;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs.ILeg;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs.SamsungLeg;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs.SonyLeg;
import lesson_interfaces.task1.robot.src.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHand handSamsung = new SamsungHand(200);
        IHand handToshiba = new ToshibaHand(340);
        IHand handSony = new SonyHand(300);
        ILeg legToshiba = new ToshibaLeg(400);
        ILeg legSamsung = new SamsungLeg(300);
        ILeg legSony = new SonyLeg(100);
        IHead headToshiba = new ToshibaHead(1500);
        IHead headSamsung = new SamsungHead(1300);
        IHead headSony = new SonyHead(1000);
        Robot robot1 = new Robot(headToshiba, handSamsung, legToshiba);
        Robot robot2 = new Robot(headSony, handSony, legSamsung);
        Robot robot3 = new Robot(headSamsung, handToshiba, legSony);
        robot1.action();
        robot2.action();
        robot3.action();

        if (robot1.getPrice() > robot2.getPrice()) {
            if (robot1.getPrice() > robot3.getPrice()) {
                System.out.println("Дороже робот 1 " + robot1.getPrice());
            } else {
                System.out.println("Дороже робот 3 " + robot3.getPrice());
            }
        } else {
            if (robot2.getPrice() > robot3.getPrice()) {
                System.out.println("Дороже робот 2 " + robot2.getPrice());
            } else {
                System.out.println("Дороже робот 3 " + robot3.getPrice());
            }
        }
    }
}
