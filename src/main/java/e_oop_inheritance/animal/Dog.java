package e_oop_inheritance.animal;

public class Dog extends Animal {
    private boolean kaganiec;

    public Dog(String name, boolean kaganiec){
        super(name);
        this.kaganiec = kaganiec;
        System.out.println(this.name);

    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
