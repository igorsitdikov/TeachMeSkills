package lesson3.extra.arrays.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] != 0 &&  array[i] % 3 == 0){
                multiplication *= array[i];
            }
        }
        System.out.println();
        System.out.println(multiplication);
    }
}
