package lesson3.extra.mdarrays.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
         * */
        System.out.println("Введите размер матрицы : ");
        int size = new Scanner(System.in).nextInt();
        int[][] array = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(String.format("%02d", array[i][j]) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int buffer = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buffer;
            }
        }

        System.out.println("\nТранспонированная матрица\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(String.format("%02d", array[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
