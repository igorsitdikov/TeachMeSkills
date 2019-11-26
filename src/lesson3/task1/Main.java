package lesson3.task1;

public class Main {
    public static void main(String[] args) {
        int number = 20;
        int arrayLength = 0;
        for (int i = 2; i <= number; i += 2) {
            arrayLength++;
        }
        System.out.println("arrayLength = " + arrayLength);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1)*2;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                continue;
            }
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
