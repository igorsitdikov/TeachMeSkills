package lesson_interfaces.task2.jacket;

public class ColinsJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надел куртку Colin's");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Colin's");
    }
}
