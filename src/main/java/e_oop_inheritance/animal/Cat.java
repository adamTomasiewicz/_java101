package e_oop_inheritance.animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau!");
    }
}
