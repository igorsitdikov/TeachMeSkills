package lesson1.task1;

import java.io.IOException;

public class Main {

    public static void main ( String[] args ) {
        int value = 9;

        String singleDigit = "однозначное ";
        String doubleDigit = "двузначное ";
        String threeAndMoreDigit = "трехзначное и более ";

        if (value > 0) {
            if (value < 10) {
                System.out.print(singleDigit);
            } else if (value >= 10 && value < 100) {
                System.out.print(doubleDigit);
            } else {
                System.out.print(threeAndMoreDigit);
            }
            System.out.println("положительное число");
        } else if (value < 0) {
            if (value > -10) {
                System.out.print(singleDigit);
            } else if (value <= -10 && value > -100) {
                System.out.print(doubleDigit);
            } else {
                System.out.print(threeAndMoreDigit);
            }
            System.out.println("отрицательное число");
        } else {
            System.out.println("ноль");
        }
    }
}
