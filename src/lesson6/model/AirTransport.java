package lesson6.model;

public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLengh;

    public AirTransport(String model, int maxSpeed, int weight, int power, int wingspan, int minRunwayLengh) {
        super(model, maxSpeed, weight, power);
        this.wingspan = wingspan;
        this.minRunwayLengh = minRunwayLengh;
    }

    @Override
    public String description() {
        return super.description() + "Размах крыльев: " + wingspan + " м\nМинимальная длина взлётно-посадочной полосы для взлёта: " + minRunwayLengh + "\n";
    }
}
