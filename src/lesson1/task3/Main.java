package lesson1.task3;

public class Main {

    public static void main ( String[] args ) {
        int value = -1;

        if (value > 0) {
            value++;
        } else if (value < 0) {
            value -= 2;
        } else {
            value = 10;
        }

        System.out.println("результат : " + value);
    }
}
