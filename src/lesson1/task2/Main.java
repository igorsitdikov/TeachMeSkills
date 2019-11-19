package lesson1.task2;

public class Main {
    public static void main ( String[] args ) {
        int a = 3;
        int b = 6;
        int c = 5;

        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Треугольник не существует!");
        } else {
            int p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            if (S != 0){
                System.out.println("Треугольник существует! Площадь : " + S);
            }else{
                System.out.println("Треугольник существует! Вырожденный треугольник!");
            }

        }

    }
}
