package lesson1.task1;

import java.io.IOException;

public class Main {

    public static void main ( String[] args ) {
        int value = 9;

        if (value > 0) {
            if (value < 10) {
                System.out.print("однозначное ");
            } else if (value >= 10 && value < 100) {
                System.out.print("двузначное ");
            } else {
                System.out.print("трехзначное и более ");
            }
            System.out.println("положительное число");
        } else if (value < 0) {
            if (value > -10) {
                System.out.print("однозначное ");
            } else if (value <= -10 && value > -100) {
                System.out.print("двузначное ");
            } else {
                System.out.print("трехзначное и более ");
            }
            System.out.println("отрицательное число");
        } else {
            System.out.println("ноль");
        }
    }
}
