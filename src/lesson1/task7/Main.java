package lesson1.task7;

public class Main {

    public static void main ( String[] args ) {
        int numProgrammers = 112;

        switch (numProgrammers % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println(numProgrammers + " программистов");
                break;
            default: {
                switch (numProgrammers % 10) {
                    case 1:
                        System.out.println(numProgrammers + " программист");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(numProgrammers + " программиста");
                        break;
                    default:
                        System.out.println(numProgrammers + " программистов");
                }
            }
        }
    }
}
