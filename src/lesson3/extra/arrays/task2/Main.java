package lesson3.extra.arrays.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];
        int sum = 0;
        int counter = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
            if (i % 2 != 0) {
                sum += array[i];
                counter++;
                System.out.println(i + "  " + array[i] + " " + counter + " " + sum);
            }
        }

        avg = (double) sum / counter;
        System.out.println("AVG " + avg);
    }
}
