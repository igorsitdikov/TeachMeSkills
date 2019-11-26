package lesson3.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 5;

        int[] firstArray = new int[length];
        int[] secondArray = new int[length];

        int firstSum = 0;
        int secondSum = 0;

        int firstAvg = 0;
        int secondAvg = 0;

        for (int i = 0; i < length; i++) {
            firstArray[i] = new Random().nextInt(16);
            secondArray[i] = new Random().nextInt(16);
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
        firstAvg = firstSum / length;
        secondAvg = secondSum / length;
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
