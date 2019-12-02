package lesson3.extra.ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
         * по очереди вводят координаты клетки в которую хотят сделать ход. После
         * каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
         * Игра продолжается до победы одного из игроков или ничьи.
         * */
        int size = 3;
        int counter = 9;
        char[][] array = new char[size][size];
        boolean player = false;
        boolean win = false;
        Scanner scanner = new Scanner(System.in);
        while (!win && counter > 0) {
            System.out.println("Введите номер строки (1-3)");
            int x = scanner.nextInt() - 1;
            System.out.println("Введите номер столбца (1-3)");
            int y = scanner.nextInt() - 1;
            if (x > 2 || x < 0 || y > 2 || y < 0) {
                System.out.println("Выход за пределы массива");
            } else if (array[x][y] == '+' || array[x][y] == 'o') {
                System.out.println("Выберите другую ячейку, эта занята.");
            } else {
                if (player) {
                    array[x][y] = '+';
                } else {
                    array[x][y] = 'o';
                }

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

                if (counter < 6) {
                    for (int i = 0; i < size; i++) {
                        if ((array[i][0] == array[i][1] && array[i][0] == array[i][2] && array[i][0] != '\u0000')
                                || (array[0][i] == array[1][i] && array[0][i] == array[2][i] && array[0][i] != '\u0000')
                                || (array[1][1] != '\u0000' && ((array[0][0] == array[1][1] && array[0][0] == array[2][2])
                                || (array[0][2] == array[1][1] && array[1][1] == array[2][0])))) {
                            if (!player) {
                                System.out.println("Выйграл игрок " + 1);
                            } else {
                                System.out.println("Выйграл игрок " + 2);
                            }
                            win = !win;
                            break;
                        }
                    }
                }

                counter--;
                player = !player;
            }
            if (!win && counter == 0) {
                System.out.println("Ничья");
            }
        }
    }
}
