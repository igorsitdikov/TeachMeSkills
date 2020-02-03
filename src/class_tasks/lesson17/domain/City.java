package class_tasks.lesson17.domain;

public class City {
    private int id;
    private String name;
    private int country_id;
    private boolean is_capital;

    public City(int id, String name, int country_id, boolean is_capital) {
        this.id = id;
        this.name = name;
        this.country_id = country_id;
        this.is_capital = is_capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public boolean isIs_capital() {
        return is_capital;
    }

    public void setIs_capital(boolean is_capital) {
        this.is_capital = is_capital;
    }
}
