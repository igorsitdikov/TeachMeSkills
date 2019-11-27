package lesson3.extra.arrays.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int c = 98;
        int length = 20;
        int[] array = new int[length];
        int sum = 0;
        int counter = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.println(array[i]);
            if (array[i] > c) {
                sum += array[i];
                counter++;
            }
        }
        if (counter > 0) {
            avg = (double) sum / counter;
        }
        System.out.println("AVG " + avg);
    }
}
