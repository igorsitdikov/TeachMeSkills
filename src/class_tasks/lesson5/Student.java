package class_tasks.lesson5;

import java.util.Scanner;

public class Student {
    String firstName;
    private String lastName;
    private int age;

    public Student() {
        System.out.println("Enter first name");
        Scanner scanner = new Scanner(System.in);
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name");
        this.lastName = scanner.nextLine();
        System.out.println("Enter age");
        this.age = scanner.nextInt();
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printInformation() {
        System.out.println("first name : " + this.firstName + "\nlast name : " + this.lastName + "\nage : " + this.age);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFullName(String prefix) {
        return prefix + this.firstName + " " + this.lastName;
    }
}