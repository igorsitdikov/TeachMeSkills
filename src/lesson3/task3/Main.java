package lesson3.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма всех четных чисел = " + sum);
    }
}
