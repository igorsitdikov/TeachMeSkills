package lesson3.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 12;
        int indexMax = 0;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(16);
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println("max value = " + max);
        System.out.println("index of max value = " + indexMax);
    }
}
