package class_tasks.lesson5;

import class_tasks.lesson5.model.*;

public class Lesson5 {
    public static void main(String[] args) {
//        Student student_console = new Student();
//        student_console.printInformation();
//        System.out.println(student_console.getFullName());
//        System.out.println(student_console.getFullName("Mr."));

        System.out.println();

        Student student = new Student("John", "Smith", 23);
        student.birthday();
        student.doHomework(0);
        student.doHomework(1);
        student.doHomework(2);
        student.doHomework(3);
        student.doHomework(4);
        student.doHomework(5);
        student.doHomework(6);
        student.doHomework(7);
        student.doHomework(8);
        student.doHomework(9);
//        student.doHomework(10);
        System.out.println("Выполненные задания");
        for (int i = 0; i < student.getHomeworkDone().length; i++) {
            System.out.print(student.getHomeworkDone()[i] + " ");
        }
        System.out.println();
        student.printInformation();
        System.out.println(student.getFullName());
        System.out.println(student.getFullName("Mr."));
        Student[] students = new Student[2];
        students[0] = new Student("Bill", "Klinton", 34);
        students[1] = new Student("Jim", "Kerry", 22);
        students[1].doHomework(2);
        Group group = new Group(1, students, "Python");
        Group group1 = new Group(2, students, "Python");
        System.out.println("Language previous: " + group.getProgramLanguage());
        group.setId(1);
        group.addStudent(student);
        group.addStudent(new Student("Jack", "London", 25));
        group.setProgramLanguage("Java");
        System.out.println();
        System.out.println("ID group : " + group.getId());
        System.out.println("Language : " + group.getProgramLanguage());

        group.printInfomation();
        int taskId = 2;
        System.out.println("Выполнили задание : " + taskId);
        Student[] st = group.checkHomework(taskId);
        for (int i = 0; i < st.length; i++) {
            st[i].printInformation();
        }

        System.out.println("Количество студентов : " + Student.getNumberOfStudents());

        Group[] groups = group.getGroups();
        System.out.println("Количество групп : " + groups.length);

        Coach coach = new Coach("Bruce", "Lee", 30, 10, group);
        coach.printInformation();
        taskId = 1;
        System.out.println("Выполнили задание : " + taskId);
        Student[] stFromCoach = coach.checkHomework(taskId);
        for (int i = 0; i < stFromCoach.length; i++) {
            stFromCoach[i].printInformation();
        }
    }
}
