package class_tasks.lesson11;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Closes closes;

    public Person(String name, int age, Closes closes) {
        this.name = name;
        this.age = age;
        this.closes = closes;
    }

    public Closes getCloses() {
        return closes;
    }

    public void setCloses(Closes closes) {
        this.closes = closes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
