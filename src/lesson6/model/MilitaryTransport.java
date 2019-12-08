package lesson6.model;

public class MilitaryTransport extends AirTransport {
    private Boolean ejectionSystem;
    private int rocket;

    public MilitaryTransport(String model, int maxSpeed, int weight, int power, int wingspan, int minRunwayLengh, Boolean ejectionSystem, int rocket) {
        super(model, maxSpeed, weight, power, wingspan, minRunwayLengh);
        this.ejectionSystem = ejectionSystem;
        this.rocket = rocket;
    }

    public void fire() {
        String text;
        if (rocket > 0) {
            rocket--;
            text = "Ракета пошла...";
        } else {
            text = "Боеприпасы отсутствуют";
        }
        System.out.println(text);
    }

    public void eject() {
        String text;
        if (ejectionSystem) {
            text = "Катапультирование прошло успешно";
        } else {
            text = "У вас нет такой системы";
        }
        System.out.println(text);
    }

    @Override
    public String description() {
        return super.description() + "Наличие системы катапультирования: " + (ejectionSystem ? "Да" : "Нет") + "\nКол-во ракет на борту: " + rocket;
    }
}
