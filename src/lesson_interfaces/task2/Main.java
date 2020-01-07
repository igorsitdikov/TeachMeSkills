package lesson_interfaces.task2;

import lesson_interfaces.task2.jacket.ColinsJacket;
import lesson_interfaces.task2.jacket.OstinJacket;
import lesson_interfaces.task2.pants.ColinsPants;
import lesson_interfaces.task2.pants.OstinPants;
import lesson_interfaces.task2.shoes.MarkoShoes;
import lesson_interfaces.task2.shoes.RiekerShoes;

public class Main {
    public static void main(String[] args) {

        Person jack = new Person("Jack", new OstinJacket(), new MarkoShoes(), new ColinsPants());
        Person sebastian = new Person("Sebastian", new ColinsJacket(), new RiekerShoes(), new OstinPants());
        jack.putOn();
        jack.putOn();
        sebastian.putOn();
        jack.takeOff();
        sebastian.takeOff();
        sebastian.takeOff();
    }
}
