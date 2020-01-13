package e_oop_interface.Wielokat;

public class Prostokat implements Wielokat{
    private final int a=2;
    private final int b=4;

    @Override
    public int getSides () {return 4;}
    @Override
    public int getPerimeter() {
        return a*2+b*2;
    }
}
