package lesson3.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
         * массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
         * это количество на экран на отдельной строке.
         * */
        int[] array = new int[15];
        int counter = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Количество четных чисел = " + counter);
    }
}
