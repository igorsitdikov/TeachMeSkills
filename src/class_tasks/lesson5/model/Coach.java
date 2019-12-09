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
    public void greet() {
        System.out.println("Привет, я тренер " + firstName);
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("years of xp : " + this.yearsOfExperience);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
