package lesson10;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private double price;

    public Car () {
    }

    public Car ( String model, int speed, double price ) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public void start () throws CarException {
        Random random = new Random();
        int check = random.nextInt(21);
        if (check % 2 == 0) {
            throw new CarException(model);
        } else {
            System.out.println("Автомобиль " + model + " завёлся.");
        }
    }

    public String getModel () {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public int getSpeed () {
        return speed;
    }

    public void setSpeed ( int speed ) {
        this.speed = speed;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }
}
