package class_tasks.lesson5.model;

import java.util.Scanner;

public class Student {
    static int count = 0;
    private String firstName;
    private String lastName;
    private int age;
    private boolean[] homework = new boolean[10];
    private int[] homeworksDone = new int[0];

    public Student() {
        System.out.println("Enter first name");
        Scanner scanner = new Scanner(System.in);
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name");
        this.lastName = scanner.nextLine();
        System.out.println("Enter age");
        this.age = scanner.nextInt();
        count++;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    public void printInformation() {
        System.out.println(getFullName() + "\nage : " + this.age);
    }

    public void doHomework(int id) {
        if (homeworksDone.length >= 10) {
            System.out.println("Студент устал((");
        } else {
            this.homework[id] = true;
            int[] homeworksBuf = new int[this.homeworksDone.length + 1];
            for (int i = 0; i < this.homeworksDone.length; i++) {
                homeworksBuf[i] = this.homeworksDone[i];
            }
            homeworksBuf[this.homeworksDone.length] = id;
            this.homeworksDone = homeworksBuf;
        }
    }
    public static int getNumberOfStudents(){
        return count;
    }
    public int[] getHomeworkDone() {
        return this.homeworksDone;
    }

    public void birthday() {
        this.age++;
    }

    public String getFullName() {
        return "first name : " + this.firstName + "\nlast name : " + this.lastName;
    }

    public String getFullName(String prefix) {
        return prefix + this.firstName + " " + this.lastName;
    }
}