package lesson2.task8;

public class Main {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 0; i < 4; i++) {
            num--;
            for (int j = 0; j < 4; j++) {
                if (j >= num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        num = 0;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (j >= num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            num++;
            System.out.println();
        }
    }
}
