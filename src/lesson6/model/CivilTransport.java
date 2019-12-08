package lesson6.model;

public class CivilTransport extends AirTransport {
    private int passengers;
    private boolean businessClass;

    public CivilTransport(String model, int maxSpeed, int weight, int power, int wingspan, int minRunwayLengh, int passengers, boolean businessClass) {
        super(model, maxSpeed, weight, power, wingspan, minRunwayLengh);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public void passengersCheck(int load) {
        String text = "";
        if (load > passengers) {
            text = "Вам нужен самолет побольше";
        } else {
            text = "Самолет заполнен";
        }
        System.out.println(text);
    }

    @Override
    public String description() {
        return super.description() + "Кол-во пассажиров: " + passengers + "\nНаличие бизнес класса: " + (businessClass ? "Да" : "Нет") + "\n";
    }
}
