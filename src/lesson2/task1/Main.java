package lesson2.task1;

public class Main {
    public static void main(String[] args) {
        double dailyDistance = 10;
        double fullDistance = 0;
        for (int i = 0; i < 7; i++) {
            fullDistance += dailyDistance;
            dailyDistance += dailyDistance * 0.1;
        }
        System.out.println("Путь за 7 дней : " + fullDistance);
    }
}
