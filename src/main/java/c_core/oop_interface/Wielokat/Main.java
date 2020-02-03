package c_core.oop_interface.Wielokat;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Wielokat[] arrayWielokatow1 = new Wielokat[10];
        Random random1 = new Random();
        for (int i = 0; i < arrayWielokatow1.length; i++) {
            int randomInt = random1.nextInt(3);
            if (randomInt == 0) arrayWielokatow1[i] = new TrojkatRownoboczny();
            if (randomInt == 1) arrayWielokatow1[i] = new Kwadrat();
            if (randomInt == 2) arrayWielokatow1[i] = new Prostokat();
        }
        for (Wielokat wielokat : arrayWielokatow1) {
            System.out.println("class " + wielokat.getClass().getSimpleName() + "sides: " + wielokat.getSides() + "perimiter " + wielokat.getPerimeter());
        }
        for (Wielokat wielokat : arrayWielokatow1) {
            System.out.println(wielokat);
        }

    }

}
