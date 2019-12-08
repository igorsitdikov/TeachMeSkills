package lesson6.model;

public class Transport {
    protected String model;
    protected int maxSpeed;
    private int weight;
    private int power;

    public Transport(String model, int maxSpeed, int weight, int power) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.power = power;
    }

    public String description() {
        return "\nМарка: " + model + "\nМаксимальная скорость: " + maxSpeed + " км/ч\nМасса: " + weight + " кг\nМощность: " + power + " л.с\nМощности в киловаттах: " + powerkW() + " кВ\n";
    }

    private double powerkW() {
        return power * 0.74;
    }
}
