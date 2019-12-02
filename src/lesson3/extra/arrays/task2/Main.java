package lesson3.extra.arrays.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти среднее арифметическое элементов с нечетными номерами.
         * */
        int length = 20;
        int[] array = new int[length];
        int sum = 0;
        int counter = 0;
        double avg = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            if (i % 2 != 0) {
                sum += array[i];
                counter++;
            }
        }

        avg = (double) sum / counter;
        System.out.println("Среднее арифметическое элементов с нечетными номерами " + avg);
    }
}
