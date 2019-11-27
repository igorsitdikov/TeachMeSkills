package lesson3.extra.arrays.task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(32);
            System.out.println(array[i]);
            if (i == 1) {
                min = array[i];
            } else if (i % 2 != 0) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println("minimum " + min);
    }
}
