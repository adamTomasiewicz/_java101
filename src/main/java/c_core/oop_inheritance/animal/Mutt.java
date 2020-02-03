package c_core.oop_inheritance.animal;

public class Mutt extends Dog {
    public Mutt(String name, boolean kaganiec) {
        super(name, kaganiec);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hau, Hau, Hau!");
    }

}
