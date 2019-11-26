package lesson3.task10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число больше 3 : ");
        int n = new Scanner(System.in).nextInt();
        if (n < 3) {
            System.out.println("Введено некорректное число");
        } else {
            int length = 0;
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt(n + 1);
                System.out.print(array[i] + " ");
                if (array[i] % 2 == 0) {
                    length++;
                }
            }
            System.out.println();
            System.out.println(length);
            int[] arrayGenearated = new int[length];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayGenearated[j] = array[i];
                    System.out.print(arrayGenearated[j] + " ");
                    j++;
                }
            }

        }
    }
}