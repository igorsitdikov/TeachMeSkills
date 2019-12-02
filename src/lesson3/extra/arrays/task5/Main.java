package lesson3.extra.arrays.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * «Сожмите» массив, выбросив из него каждый второй элемент.
         * «Освободившиеся» места массива заполните нулями.
         * */
        int length = 20;
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 2; i < length; i += 2) {
            array[i / 2] = array[i];
            array[i] = 0;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
