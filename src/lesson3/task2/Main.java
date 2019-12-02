package lesson3.task2;

public class Main {
    public static void main(String[] args) {
        /*
         * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
         * строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
         * порядке (99 97 95 93 ... 7 5 3 1).
         * */
        int number = 99;
        int arrayLength = 0;
        for (int i = 1; i <= number; i += 2) {
            arrayLength++;
        }
        int[] array = new int[arrayLength];

        for (int i = 1, j = 0; i <= number; i += 2, j++) {
            array[j] = i;
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
