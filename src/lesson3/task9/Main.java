package lesson3.task9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите положительное число ->");
        int length = new Scanner(System.in).nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(16);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int sum = 0;
        if (array.length % 2 != 0) {
            System.out.println("В массиве не четное количество элементов!");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {
                    sum += array[i];
                } else {
                    sum -= array[i];
                }
            }
            if (sum > 0) {
                System.out.println("В первой половине сумма больше");
            } else if (sum < 0) {
                System.out.println("Во второй половине сумма больше");
            } else {
                System.out.println("Суммы модулей равны");
            }
        }


    }
}
