package class_tasks.lesson5.model;

public class Group {
    private int id;
    private Student[] students;
    private String programLanguage;

    public Group() {
        this.students = new Student[0];
    }

    public Group(int id, Student[] students, String programLanguage) {
        this.id = id;
        this.students = students;
        this.programLanguage = programLanguage;
    }

    public Group(int id, String programLanguage) {
        this.id = id;
        this.programLanguage = programLanguage;
        this.students = new Student[0];
    }

    public void addStudent(Student student) {
        Student[] students_buf = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            students_buf[i] = this.students[i];
        }
        students_buf[this.students.length] = student;
        this.students = students_buf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }
}
