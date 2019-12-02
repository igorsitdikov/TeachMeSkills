package lesson3.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
         * какой элемент является в этом массиве максимальным и сообщите индекс его
         * последнего вхождения в массив.
         * */
        int length = 12;
        int indexMax = 0;
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            } else if (max == array[i]){
                indexMax = i;
            }
        }

        System.out.println("max value = " + max);
        System.out.println("index of max value = " + indexMax);
    }
}
