package class_tasks.lesson17.domain;

import java.sql.Date;

public class People {
    private int id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private int birth_city_id;

    public People(int id, String first_name, String last_name, Date date_of_birth, int birth_city_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.birth_city_id = birth_city_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getBirth_city_id() {
        return birth_city_id;
    }

    public void setBirth_city_id(int birth_city_id) {
        this.birth_city_id = birth_city_id;
    }
}
