package lesson1.task6;

public class Main {

    public static void main ( String[] args ) {
        int value1 = 22;
        int value2 = -25;

        if (value1 > value2) {
            System.out.println(value1 + " большее из чисел " + value1 + " и " + value2);
        } else if (value1 < value2) {
            System.out.println(value2 + " большее из чисел " + value1 + " и " + value2);
        } else {
            System.out.println("числа " + value1 + " и " + value2 + " равны");
        }

    }
}
