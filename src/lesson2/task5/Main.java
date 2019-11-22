package lesson2.task5;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            switch (i % 100) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    System.out.print(i + " дюймов ");
                    break;
                default: {
                    switch (i % 10) {
                        case 1:
                            System.out.print(i + " дюйм ");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.print(i + " дюйма ");
                            break;
                        default:
                            System.out.print(i + " дюймов ");
                    }
                }
            }
            System.out.println(i * 2.54 + " см");
        }
    }
}
