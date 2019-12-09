package class_tasks.lesson5.model;

public class Human {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Human() {
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void greet() {
        System.out.println("Привет, я " + firstName);
    }

    public void printInformation() {
        System.out.println(getFullName() + "\nage : " + this.age);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 110) {
            this.age = age;
        }
    }
}
