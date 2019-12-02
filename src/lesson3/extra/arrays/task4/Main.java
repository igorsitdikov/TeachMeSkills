package lesson3.extra.arrays.task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти наименьший нечетный элемент.
         * */
        int length = 20;
        int[] array = new int[length];
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(32);
            System.out.print(array[i] + " ");
            if (i == 1) {
                min = array[i];
            }
            if (array[i] % 2 != 0) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println();
        System.out.println("Наименьший нечетный элемент " + min);
    }
}
