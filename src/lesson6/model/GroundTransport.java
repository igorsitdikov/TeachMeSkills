package lesson6.model;

public class GroundTransport extends Transport {
    private int wheels;
    protected int fuelConsumption;

    public GroundTransport(String model, int maxSpeed, int weight, int power, int wheels, int fuelConsumption) {
        super(model, maxSpeed, weight, power);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String description() {
        return super.description() + "Количество колёс: " + wheels + "\nРасход топлива: " + fuelConsumption + " л/100км\n";
    }
}
