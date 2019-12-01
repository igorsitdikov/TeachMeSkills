package lesson3.extra.mdarrays.task3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Проверить произведение элементов какой диагонали больше.
         * */
        System.out.println("Введите размер матрицы : ");
        int size = new Scanner(System.in).nextInt();
        int[][] array = new int[size][size];
        int multMain = 1;
        int multSide = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = new Random().nextInt(51);
                System.out.print(String.format("%02d", array[i][j]) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            multMain *= array[i][i];
            multSide *= array[i][size - i - 1];
        }

        if (multMain > multSide) {
            System.out.println("Главная диагональ больше");
        } else if (multMain < multSide) {
            System.out.println("Побочная диагональ больше");
        } else {
            System.out.println("Диагонали равны");
        }
    }
}
