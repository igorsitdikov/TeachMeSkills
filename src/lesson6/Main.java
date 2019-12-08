package lesson6;

import lesson6.model.*;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("Audi", 300, 2500, 400);
        System.out.println(transport.description());

        PassengerTransport passengerTransport = new PassengerTransport("Audi", 230, 2500, 400, 4, 8, "седан", 4);
        System.out.println(passengerTransport.description());
        passengerTransport.distance(2.5);

        CivilTransport civilTransport = new CivilTransport("Boing", 1300, 25000, 2401, 20, 2500, 100, false);
        System.out.println(civilTransport.description());
        civilTransport.passengersCheck(100);

        CargoTransport cargoTransport = new CargoTransport("MAZ", 120, 10, 1000, 6, 20, 5);
        System.out.println(cargoTransport.description());
        cargoTransport.payloadCheck(6);

        MilitaryTransport militaryTransport = new MilitaryTransport("MiG-29", 2000, 12000, 3000, 10, 500, true, 2);
        System.out.println(militaryTransport.description());
        militaryTransport.fire();
        militaryTransport.fire();
        militaryTransport.fire();
        militaryTransport.eject();
    }
}
