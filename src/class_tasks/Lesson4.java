package class_tasks;

import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        int length = 20;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        while (length > 0) {
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    int buf = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = buf;
                }
            }
            length--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /*
         * Show X-mas tree :))
         *
         * */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            if (i % 2 != 0) {
                for (int j = n - i; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = n; j < n + i + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            } else {
                for (int j = n - i; j < n + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                for (int j = n + 1; j < n + i + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= n * i - 1; j++) {
                if ((j > n - i - 1 && j < n) || (j < n + i - 1 && j >= n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        /*
         * Show all simple numbers
         * */
        n = 1000;

        for (int i = 1; i < n; i++) {
            int counter = 0;

            if ( i % 2 != 0 || i % 5 !=0)
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    counter++;
                } else if (counter > 2) {
                    break;
                } else {
                    continue;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }


        /*
         * Show all perfect numbers
         * */
        System.out.println("Show all perfect numbers");
        n = 10000;

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if (sum > i) {
                    break;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
