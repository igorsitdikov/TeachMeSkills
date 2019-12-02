package lesson3.extra.arrays.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти среднее арифметическое элементов массива, превосходящих некоторое число С.
         * */
        int c = 38;
        int length = 20;
        int[] array = new int[length];
        int sum = 0;
        int counter = 0;
        double avg = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] > c) {
                sum += array[i];
                counter++;
            }
        }
        if (counter > 0) {
            avg = (double) sum / counter;
        }
        System.out.println();
        System.out.println("Cреднее арифметическое элементов массива, превосходящих число " + c + " = " + avg);
    }
}
