package lesson3.task6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
         * на экран в строку. Определить и вывести на экран сообщение о том, является ли
         * массив строго возрастающей последовательностью.
         * */

        int length = 3;
        int[] array = new int[length];
        int incr = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                incr++;
            }
        }
        System.out.println();
        if (incr == array.length - 1) {
            System.out.println("Строго возрастающая последовательность");
        } else {
            System.out.println("Не строго возрастающая последовательность");
        }
    }
}
