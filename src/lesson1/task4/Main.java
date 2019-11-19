package lesson1.task4;

public class Main {

    public static void main ( String[] args ) {
        int num1 = 2;
        int num2 = -2;
        int num3 = 2;

        int numPositive = 0;

        if (num1 > 0) {
            numPositive++;
        }
        if (num2 > 0) {
            numPositive++;
        }
        if (num3 > 0) {
            numPositive++;
        }
        System.out.println("количество положительных чисел в исходном наборе : " + numPositive);
    }
}
