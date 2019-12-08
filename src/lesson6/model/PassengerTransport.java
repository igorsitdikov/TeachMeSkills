package lesson6.model;

public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int passengers;

    public PassengerTransport(String model, int maxSpeed, int weight, int power, int wheels, int fuelConsumption, String bodyType, int passengers) {
        super(model, maxSpeed, weight, power, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public void distance(double hours) {
        double distance = hours * super.maxSpeed;
        double fuel = fuelNeed(distance);
        String text = "За время " + hours + " ч, автомобиль " + model + "\n" +
                "двигаясь с максимальной скоростью " + maxSpeed + " км/ч\n" +
                "проедет " + distance + " км и израсходует " + fuel + " литров топлива.";
        System.out.println(text);
    }

    private double fuelNeed(double distance) {
        return distance / 100 * fuelConsumption;
    }

    @Override
    public String description() {
        return super.description() + "Тип кузова: " + bodyType + "\nКол-во пассажиров: " + passengers + "\n";
    }
}
