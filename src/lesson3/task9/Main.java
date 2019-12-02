package lesson3.task9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *Пользователь должен указать с клавиатуры положительное число, а
        * программа должна создать массив указанного размера из случайных целых
        * чисел из [0;15] и вывести его на экран в строку. После этого программа должна
        * определить и сообщить пользователю о том, сумма какой половины массива
        * больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
        * пользователь введёт неподходящее число, то выдать соответствующее
        * сообщение
        * */

        System.out.println("Введите положительное число ->");
        int length = new Scanner(System.in).nextInt();
        if (length >= 0) {
            int[] array = new int[length];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(16);
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
        } else {
            System.out.println("Число должно быть положительным.");
        }
    }
}
