package lesson3.extra.arrays.task10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
         * */
        int length = 20;
        int[] array = new int[length];
        int max = 0;
        int indexMax = 0;
        int indexZero = -1;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(32);
            System.out.print(array[i] + " ");
            if (i == 0) {
                max = array[i];
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] == 0) {
                indexZero = i;
            }
        }
        System.out.println();
        if (indexZero != -1) {
            int buffer = array[indexMax];
            array[indexMax] = array[indexZero];
            array[indexZero] = buffer;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
