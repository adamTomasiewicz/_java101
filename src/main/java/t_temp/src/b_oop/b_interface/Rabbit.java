package pl.adamTomasiewicz.b_akademia.b_oop.b_interface;

public class Rabbit extends Animal implements Voiceable, Runable {



    @Override
    public void getVoice() {
        System.out.println("Kwil, Kwil!");
    }

    @Override
    public void getRun() {
        System.out.println("Kic, Kic");
    }

    @Override
    protected void nurish() {

    }
}
