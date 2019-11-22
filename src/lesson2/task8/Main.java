package lesson2.task8;

public class Main {
    public static void main(String[] args) {
        int rows = 4;

        /*
         * First way
         */

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * Second way
         */

        int i = 0;
        int currentRow = 0;
        while (rows * 2 >= currentRow) {
            if (currentRow <= rows) {
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if (currentRow == rows) {
                    i = 0;
                    System.out.println();
                }

            } else {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= rows; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            currentRow++;
            i++;
        }

    }
}
