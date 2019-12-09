package class_tasks.lesson5.model;

public class Group {
    private static Group[] group = new Group[0];
    private int id;
    private Student[] students;
    private String programLanguage;

    public Group() {
        this.students = new Student[0];
        addGroup();
    }

    public Group(int id, Student[] students, String programLanguage) {
        this.id = id;
        this.students = students;
        this.programLanguage = programLanguage;
        addGroup();
    }

    public Group(int id, String programLanguage) {
        this.id = id;
        this.programLanguage = programLanguage;
        this.students = new Student[0];
        addGroup();
    }

    public void addStudent(Student student) {
        Student[] students_buf = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            students_buf[i] = this.students[i];
        }
        students_buf[this.students.length] = student;
        this.students = students_buf;
    }

    public Student[] checkHomework(int id) {
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].getHomeworkDone().length; j++) {
                if (students[i].getHomeworkDone()[j] == id) {
                    counter++;
                }
            }
        }
        Student[] studentsDone = new Student[counter];
        counter = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].getHomeworkDone().length; j++) {
                if (students[i].getHomeworkDone()[j] == id) {
                    studentsDone[counter] = students[i];
                    counter++;
                }
            }
        }
        return studentsDone;
    }

    private void addGroup() {
        Group[] buf = new Group[group.length + 1];
        for (int i = 0; i < group.length; i++) {
            buf[i] = group[i];
        }
        buf[group.length] = this;
        group = buf;
    }

    public Group[] getGroups() {
        return group;
    }

    public void printInfomation() {
        System.out.println("Students : ");
        System.out.println();
        for (int i = 0; i < this.students.length; i++) {
            this.students[i].printInformation();
            System.out.println();
        }
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

    public static Group[] getGroup() {
        return group;
    }

    public static void setGroup(Group[] group) {
        Group.group = group;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
