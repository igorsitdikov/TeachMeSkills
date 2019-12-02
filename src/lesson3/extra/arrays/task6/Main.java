package lesson3.extra.arrays.task6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Проверить, различны ли все элементы массива.
         * */

        int length = 5;
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j && array[i] == array[j]) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println();
        if (counter == 0) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("Не все элементы массива различны");
        }
    }
}
