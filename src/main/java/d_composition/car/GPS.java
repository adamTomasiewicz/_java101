package d_composition.car;

import java.util.Random;

public class GPS {

    private int position =1000;
    public boolean isAt(String destination) {
        return position == 0;
    }

    public void updateLocation () {
        position = new Random().nextInt(30);
    }

}
