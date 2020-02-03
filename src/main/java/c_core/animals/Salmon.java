package c_core.animals;

public class Salmon extends Animal implements Swimable {
    @Override
    public void getSwim() {
        System.out.println("Hlup Hlup!");
    }

    @Override
    protected void nurish() {

    }
}
