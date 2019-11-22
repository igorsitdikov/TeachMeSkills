package lesson2.task3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {

            if (i == 1)
                System.out.print(i);
            else
                System.out.print("+" + i);

            sum += i;
        }
        System.out.println(" = " + sum);
    }
}
