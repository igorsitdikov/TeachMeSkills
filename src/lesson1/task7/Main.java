package lesson1.task7;

public class Main {

    public static void main ( String[] args ) {
        int numProgrammers = 121;
        if ((numProgrammers % 100) > 10 && (numProgrammers % 100) < 20) {
            System.out.println(numProgrammers + " программистов");
        } else if ((numProgrammers - 1) % 10 == 0) {
            System.out.println(numProgrammers + " программист");
        } else if (numProgrammers % 10 == 2 || numProgrammers % 10 == 3 || numProgrammers % 10 == 4) {
            System.out.println(numProgrammers + " программиста");
        } else {
            System.out.println(numProgrammers + " программистов");
        }
    }
}
