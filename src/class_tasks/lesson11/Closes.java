package class_tasks.lesson11;

import java.io.Serializable;

public class Closes implements Serializable {
    private String pants;
    private transient String chest;

    public Closes(String pants, String chest) {
        this.pants = pants;
        this.chest = chest;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }
}
