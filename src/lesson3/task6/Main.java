package lesson3.task6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 4;
        int[] array = new int[length];
        boolean incr = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11);
            System.out.print(array[i] + " ");
            if (i > 0 && array[i] < array[i-1]){
                incr = false;
            }
        }
        System.out.println();
        if (incr){
            System.out.println("Строго возрастающая последовательность");
        }else {
            System.out.println("Не строго возрастающая последовательность");
        }
    }
}
