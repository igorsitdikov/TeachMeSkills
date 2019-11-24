package lesson2.task7;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("Сумма всех нечётных чисел от 1 до 99 : " + sum);
    }
}