package class_tasks;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("enter array's size : ");
        int length = new Scanner(System.in).nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.println("element " + i + " = " + array[i]);
        }

        int min = array[0];
        int max = array[0];
        int numMax = 0;
        int numMin = 0;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
                numMax = 1;
                indexMax = i;
            } else if (max == array[i])
                numMax++;
            if (min > array[i]) {
                min = array[i];
                numMin = 1;
                indexMin = i;
            } else if (min == array[i]) {
                numMin++;
            }

        }

        System.out.println("max value = " + max);
        System.out.println("number of max values = " + numMax);
        System.out.println("index of max value = " + indexMax);
        System.out.println("min value = " + min);
        System.out.println("number of min values = " + numMin);
        System.out.println("index of min value = " + indexMin);
    }
}
