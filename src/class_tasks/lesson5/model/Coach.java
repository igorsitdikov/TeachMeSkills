package class_tasks.lesson5.model;

public class Coach extends Human {
    private int yearsOfExperience;
    private Group group;

    public Coach(String firstName, String lastName, int age, int yearsOfExperience, Group group) {
        super(firstName, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
        this.group = group;
    }

    public Student[] checkHomework(int id) {
        return this.group.checkHomework(id);
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("years of xp : " + this.yearsOfExperience);
    }
}
