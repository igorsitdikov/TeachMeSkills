package lesson_interfaces.task3;

import lesson_interfaces.task3.interfaces.IStart;
import lesson_interfaces.task3.model.Cosmodrom;
import lesson_interfaces.task3.model.Shuttle;
import lesson_interfaces.task3.model.SpaceX;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.start(shuttle);
        cosmodrom.start(spaceX);
    }
}
