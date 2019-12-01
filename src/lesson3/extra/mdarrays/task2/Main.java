package lesson3.extra.mdarrays.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Вывести нечетные элементы находящиеся под главной
         * диагональю(включительно).
         * */
        System.out.println("Введите размер матрицы : ");
        int size = new Scanner(System.in).nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = new Random().nextInt(51);
                System.out.print(String.format("%02d", array[i][j]) + " ");

            }
            System.out.println();
        }
        System.out.println("Нечетные элементы под главной диагональю");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i && array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
