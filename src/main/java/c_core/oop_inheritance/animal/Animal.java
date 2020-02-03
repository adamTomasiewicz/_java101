package c_core.oop_inheritance.animal;

public abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public String getName() {
        return this.name;
    }
}
