package c_core.oop_interface.Wielokat;

public class Kwadrat implements Wielokat {
    private final int a = 4;

    @Override
    public int getSides() {
        return 4;
    }

    @Override
    public int getPerimeter() {
        return a * 4;
    }
}
