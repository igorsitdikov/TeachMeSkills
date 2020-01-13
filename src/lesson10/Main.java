package lesson10;

public class Main {
    public static void main ( String[] args ) {
        Car audi = new Car("Audi", 220, 15000);
        Car bmw = new Car("BMW", 320, 25000);
        try {
            audi.start();
        } catch (CarException e) {
            System.out.println("Двигатель заменен. " + e.getMessage() + " завёлся.");
        }
        try {
            bmw.start();
        } catch (CarException e) {
            System.out.println("Двигатель заменен. " + e.getMessage() + " завёлся.");
        }
    }
}
