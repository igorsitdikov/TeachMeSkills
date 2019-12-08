package lesson6.model;

public class CargoTransport extends GroundTransport {
    private int payload;

    public CargoTransport(String model, int maxSpeed, int weight, int power, int wheels, int fuelConsumption, int payload) {
        super(model, maxSpeed, weight, power, wheels, fuelConsumption);
        this.payload = payload;
    }

    public void payloadCheck(int load) {
        String text = "";
        if (load > payload) {
            text = "Вам нужен грузовик побольше";
        } else {
            text = "Грузовик загружен";
        }
        System.out.println(text);
    }

    @Override
    public String description() {
        return super.description() + "Грузоподъёмность: " + payload + " т\n";
    }
}
