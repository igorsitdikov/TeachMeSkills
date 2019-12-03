package lesson5;

public class Main {
    public static void main ( String[] args ) {
        Computer computer = new Computer("Intel® Core™ i5-6500 CPU @ 3.20GHz × 4", "23,3 GiB", "256GiB", 3);

        computer.info();

        System.out.println();

        while (!computer.isBurned()){
            computer.onOff();
        }
        computer.onOff();
    }
}
