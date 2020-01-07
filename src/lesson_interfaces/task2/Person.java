package lesson_interfaces.task2;

import lesson_interfaces.task2.clothes.IClothes;
import lesson_interfaces.task2.jacket.IJacket;
import lesson_interfaces.task2.pants.IPants;
import lesson_interfaces.task2.shoes.IShoes;

public class Person implements IClothes {
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;
    private boolean state;

    public Person(String name, IJacket jacket, IShoes shoes, IPants pants) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }

    @Override
    public void putOn() {
        if (!state) {
            state = true;
            jacket.putOn();
            pants.putOn();
            shoes.putOn();
        } else {
            System.out.println(name + " уже одет.");
        }
    }

    @Override
    public void takeOff() {
        if (state) {
            shoes.takeOff();
            pants.takeOff();
            jacket.takeOff();
            state = false;
        } else {
            System.out.println(name + " уже раздет.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }
}
