package lesson3.extra.arrays.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
            System.out.print(array[i] + " ");
            if (i % 2 == 0 && i != 0) {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
//            if ()
        }
    }
}
