package lesson3.extra.arrays.task8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Найти второй по величине (т.е. следующий по величине за максимальным)
         * элемент в массиве.
         * */
        int length = 20;
        int[] array = new int[length];
        int secondMax = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
            System.out.print(array[i] + " ");
            if (i == 0) {
                max = array[i];
                secondMax = array[i];
            } else if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] < max && secondMax < array[i] && secondMax != max){
                secondMax = array[i];
            }
        }
        System.out.println();
        System.out.println("Второй по величине элемент в массиве " + secondMax);
    }
}
