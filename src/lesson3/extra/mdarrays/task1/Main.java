package lesson3.extra.mdarrays.task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Посчитать сумму четных элементов стоящих на главной диагонали.
        * */
        System.out.println("Введите размер матрицы : ");
        int size = new Scanner(System.in).nextInt();
        int[][] array = new int[size][size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = new Random().nextInt(51);
                if (i == j && array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
                System.out.print(String.format("%02d", array[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма = " + sum);

    }
}
