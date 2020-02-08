package pl.adamTomasiewicz.b_akademia.b_oop.b_interface;

public class Dog extends Animal implements Voiceable, Runable{


    @Override
    public void getVoice() {
        System.out.println("Woof! Woof! AuuuU!");
    }


    @Override
    public void getRun() {
        System.out.println("Bieg, Bieg, Bieg");
    }

    @Override
    protected void nurish() {

    }
}
