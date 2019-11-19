package lesson1.task5;

public class Main {

    public static void main ( String[] args ) {
        int num1 = -2;
        int num2 = 2;
        int num3 = 0;

        int numPositive = 0;
        int numNegative = 0;
        int numZero = 0;

        if (num1 > 0) {
            numPositive++;
        } else if (num1 != 0) {
            numNegative++;
        } else {
            numZero++;
        }

        if (num2 > 0) {
            numPositive++;
        } else if (num2 != 0) {
            numNegative++;
        } else {
            numZero++;
        }

        if (num3 > 0) {
            numPositive++;
        } else if (num3 != 0) {
            numNegative++;
        } else {
            numZero++;
        }

        System.out.println("количество положительных чисел в исходном наборе : " + numPositive);
        System.out.println("количество отрицательных чисел в исходном наборе : " + numNegative);
        System.out.println("количество нулей в исходном наборе : " + numZero);
    }
}
