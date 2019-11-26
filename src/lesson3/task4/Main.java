package lesson3.task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(21);
            System.out.print(array[i] + " ");
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
