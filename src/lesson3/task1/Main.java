package lesson3.task1;

public class Main {
    public static void main(String[] args) {
        /*
         *Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
         * массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
         * затем в столбик (отделяя один элемент от другого началом новой строки). Перед
         * созданием массива подумайте, какого он будет размера.
         * */
        int number = 20;
        int arrayLength = 0;
        for (int i = 2; i <= number; i += 2) {
            arrayLength++;
        }
        System.out.println("arrayLength = " + arrayLength);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
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
