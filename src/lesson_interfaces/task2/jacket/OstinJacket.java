package lesson_interfaces.task2.jacket;

public class OstinJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Ostin");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Ostin");
    }
}
