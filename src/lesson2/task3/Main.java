package lesson2.task3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
