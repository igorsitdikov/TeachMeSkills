package lesson3.extra.arrays.task9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти наименьший элемент среди элементов с четными индексами массива
         * */
        int length = 20;
        int[] array = new int[length];
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(32);
            System.out.print(array[i] + " ");
            if (i == 0) {
                min = array[i];
            } else if (i % 2 == 0) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println();
        System.out.println("Наименьший элемент среди элементов с четными индексами массива " + min);
    }
}
