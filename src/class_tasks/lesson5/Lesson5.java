package class_tasks.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 23);
        student.firstName = "Den";
        student.printInformation();
        System.out.println(student.getFullName());
        System.out.println(student.getFullName("Mr."));
    }
}
