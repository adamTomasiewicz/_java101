package pl.adamTomasiewicz.b_akademia.b_oop.b_interface;

public class Salmon extends Animal implements Swimable{
    @Override
    public void getSwim() {
        System.out.println("Hlup Hlup!");
    }

    @Override
    protected void nurish() {

    }
}
