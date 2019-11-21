package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 0; i < 12; i+=3) {
            System.out.println("Hour " + i + " ameba : " + ameba);
            ameba *= 2;
        }
    }
}
