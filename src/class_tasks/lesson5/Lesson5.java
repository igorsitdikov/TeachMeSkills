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
        student.printInformation();
        System.out.println(student.getFullName());
        System.out.println(student.getFullName("Mr."));
        Student[] students = new Student[2];
        students[0] = new Student("Bill", "Klinton", 34);
        students[1] = new Student("Jim", "Kerry", 22);
        Group group = new Group(1, students, "Python");
        System.out.println("Language previous: " + group.getProgramLanguage());
        group.setId(1);
        group.addStudent(student);
        group.addStudent(new Student("Jack", "London", 25));
        group.setProgramLanguage("Java");
        System.out.println();
        System.out.println("ID group : " + group.getId());
        System.out.println("Language : " + group.getProgramLanguage());
        System.out.println("Students : ");
        for (int i = 0; i < group.getStudents().length; i++) {
            System.out.println("\t" + group.getStudents()[i].getFullName());
        }
    }
}
