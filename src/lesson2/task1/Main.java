package lesson2.task1;

public class Main {
    public static void main(String[] args) {
        double distance = 10;
        double fullDistance = 0;
        for (int i = 0; i < 7; i++) {
            fullDistance += distance;
            distance +=  distance * 0.1;
        }
        System.out.println(distance);
        System.out.println(fullDistance);
    }
}
