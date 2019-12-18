package class_tasks.lesson6;

import class_tasks.lesson6.interfaces.Drawable;
import class_tasks.lesson6.interfaces.Printable;

public class Point implements Printable, Drawable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        int side = 100;
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j <= side; j++) {
                if (i == side / 2 - y && j == side / 2 + x) {
                    System.out.print("*");
                } else if (i == side / 2) {
                    System.out.print("-");
                } else if (j == side / 2) {
                    System.out.print("|");
                } else if (j == side / 2 && i == side / 2) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }

    @Override
    public void printInformation() {
        System.out.println("Point : x " + x + " Point : y " + y);
    }
}
