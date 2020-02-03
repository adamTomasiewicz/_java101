package c_core.oop_interface.Wielokat;

public class TrojkatRownoboczny implements Wielokat {
    private final int a = 3;

    public TrojkatRownoboczny() {

    }


    @Override
    public int getSides() {
        return 3;
    }

    @Override
    public int getPerimeter() {
        return a * 3;
    }


}
