package lesson3.extra.arrays.task7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Подсчитать, сколько раз встречается элемент с заданным значением.
         * */
        Random random = new Random();
        System.out.println("Введите число < 20: ");
        int value = new Scanner(System.in).nextInt();
        int length = 20;
        int[] array = new int[length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.print(array[i] + " ");
            if (array[i] == value) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Элемент " + value + " встречается в массиве " + counter + " раз.");
    }
}
