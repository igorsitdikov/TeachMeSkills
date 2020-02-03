package class_tasks.lesson17.domain;

public class Country {
    private int id;
    private String name;
    private String code;
    private int population;

    public Country(int id, String name, String code, int population) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public Country(String name, String code, int population) {
        this.name = name;
        this.code = code;
        this.population = population;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "'" + this.name + "','" + this.code + "'," + this.population;
    }
}
