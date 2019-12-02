package lesson3.extra.arrays.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти произведение элементов, кратных 3.
         * */
        int length = 20;
        int[] array = new int[length];
        int multiplication = 1;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] != 0 && array[i] % 3 == 0) {
                multiplication *= array[i];
            }
        }
        System.out.println();
        System.out.println("Произведение элементов, кратных 3 = " + multiplication);
    }
}
