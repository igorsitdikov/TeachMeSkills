package lesson3.extra.arrays.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);

        }
    }
}
