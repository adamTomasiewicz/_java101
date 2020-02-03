package c_core.oop_inheritance.animal;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Muuu!");
    }
}
