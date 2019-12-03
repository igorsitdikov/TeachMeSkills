package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int source;
    private boolean burned;
    private boolean turnedOn;

    public Computer(String cpu, String ram, String hdd, int source) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.source = source;
    }

    public void info() {
        System.out.println("Процессор : " + cpu);
        System.out.println("Оперативная память : " + ram);
        System.out.println("Жесткий диск : " + hdd);
        System.out.println("Ресурс : " + source);
    }

    public void onOff() {
        if (burned) {
            System.out.println("Компьютер не может быть включен!");
        } else {
            Scanner scanner = new Scanner(System.in);
            turnedOn = !turnedOn;
            int i = new Random().nextInt(2);
            int check = scanner.nextInt();
            if (check == i) {
                if (source == 0) {
                    burned = true;
                    System.out.println("Компьютер сгорел ресурс израсходован");
                } else {
                    if (turnedOn) {
                        System.out.println("Компьютер включился успешно");
                        source--;
                    } else {
                        System.out.println("Компьютер выключился успешно");
                        System.out.println("Ресурс : " + source);
                    }
                }
            } else {
                if (turnedOn) {
                    System.out.println("Компьютер сгорел неправильное включение");
                } else {
                    System.out.println("Компьютер сгорел неправильное выключение");
                }
                burned = true;
            }
        }
    }

    public boolean isBurned() {
        return burned;
    }

    public int getSource() {
        return source;
    }
}
