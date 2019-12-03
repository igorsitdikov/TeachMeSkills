package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int source;
    private boolean state = true;
    private boolean onOffCheck;

    public Computer ( String cpu, String ram, String hdd, int source ) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.source = source;
    }

    public void info () {
        System.out.println("Процессор : " + this.cpu);
        System.out.println("Оперативная память : " + this.ram);
        System.out.println("Жесткий диск : " + this.hdd);
        System.out.println("Ресурс : " + this.source);
    }

    public void onOff () {
        Scanner scanner = new Scanner(System.in);
        onOffCheck = !onOffCheck;
        int check = scanner.nextInt();
        int i = new Random().nextInt(2);
        if (check == i) {
            if (this.source == 0) {
                this.state = false;
                System.out.println("Компьютер сгорел ресурс израсходован");
            } else {
                if (onOffCheck) {
                    System.out.println("Компьютер включился успешно");
                    this.source--;
                } else {
                    System.out.println("Компьютер выключился успешно");
                    System.out.println("Ресурс : " + this.source);
                }
            }
        } else {
            if (onOffCheck) {
                System.out.println("Компьютер сгорел неправильное включение");
            } else {
                System.out.println("Компьютер сгорел неправильное выключение");
            }
            this.state = false;
        }
    }

    public boolean isState () {
        return state;
    }

    public int getSource () {
        return source;
    }
}
