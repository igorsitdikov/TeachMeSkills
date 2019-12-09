package class_tasks.lesson5.model;

import java.util.Scanner;

public class Student extends Human {
    private static int count = 0;
    private boolean[] homework = new boolean[10];
    private int[] homeworksDone = new int[0];

    public Student() {
        System.out.println("Enter first name");
        Scanner scanner = new Scanner(System.in);
        super.firstName = scanner.nextLine();
        System.out.println("Enter last name");
        super.lastName = scanner.nextLine();
        System.out.println("Enter age");
        super.age = scanner.nextInt();
        count++;
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        count++;
    }

    @Override
    public void greet() {
        System.out.println("Привет, я студент " + firstName);
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

    public static int getNumberOfStudents() {
        return count;
    }

    public int[] getHomeworkDone() {
        return this.homeworksDone;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public boolean[] getHomework() {
        return homework;
    }

    public void setHomework(boolean[] homework) {
        this.homework = homework;
    }

    public int[] getHomeworksDone() {
        return homeworksDone;
    }

    public void setHomeworksDone(int[] homeworksDone) {
        this.homeworksDone = homeworksDone;
    }
}
