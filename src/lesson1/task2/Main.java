package lesson1.task2;

public class Main {
    public static void main ( String[] args ) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)){
            System.out.println("Треугольник не существует!");
        }

    }
}
