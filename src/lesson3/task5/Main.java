package lesson3.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
        * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
        * арифметическое элементов каждого массива и сообщите, для какого из
        * массивов это значение оказалось больше (либо сообщите, что их средние
        * арифметические равны).
        * */

        int length = 5;

        int[] firstArray = new int[length];
        int[] secondArray = new int[length];

        int firstSum = 0;
        int secondSum = 0;

        double firstAvg = 0;
        double secondAvg = 0;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            firstArray[i] = random.nextInt(16);
            secondArray[i] = random.nextInt(16);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(firstArray[i] + " ");
            firstSum += firstArray[i];
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(secondArray[i] + " ");
            secondSum += secondArray[i];
        }
        firstAvg = (double) firstSum / length;
        secondAvg = (double) secondSum / length;
        System.out.println();
        System.out.println("avg of first array = " + firstAvg);
        System.out.println("avg of second array = " + secondAvg);
        if (firstAvg < secondAvg) {
            System.out.println("avg of second array more then avg of first array");
        } else if (firstAvg > secondAvg) {
            System.out.println("avg of first array more then avg of second array");
        } else {
            System.out.println("avg of arrays the same");
        }
    }
}
