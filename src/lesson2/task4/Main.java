package lesson2.task4;

public class Main {
    public static void main(String[] args) {
        int A = -3;
        int B = -3;
        int result = 0;
        if ((A < 0 && B < 0) || (A < 0 && B > 0)) {
            A = -A;
            B = -B;
        }
        for (int i = 0; i < A; i++) {
            result += B;
        }
        System.out.println("A * B = " + result);
    }
}
