package lesson3.task8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int num = 0;
        int[] arrayFirst = new int[length];
        int[] arraySecond = new int[length];
        double[] arrayThird = new double[length];
        for (int i = 0; i < length; i++) {
            arrayFirst[i] = new Random().nextInt(10);
            arraySecond[i] = new Random().nextInt(10);
            arrayThird[i] = (double) arrayFirst[i] / arraySecond[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arrayFirst[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(arraySecond[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(arrayThird[i] + " ");
            if (arrayThird[i] % 1 == 0) {
                num++;
            }
        }
        System.out.println();
        System.out.println("Количество целых чисел = " + num);
    }
}
